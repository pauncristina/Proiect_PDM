package com.example.test_proiect;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import com.example.test_proiect.QuizContract.*;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;
    public QuizDbHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }
    private void fillQuestionsTable() {
        Question q1 = new Question("... pe fier ascute", "Fier", "Sabie", "Topor", 1);
        addQuestion(q1);
        Question q2 = new Question("Cate cojoace purta baba Dochia?", "5", "9", "12", 2);
        addQuestion(q2);
        Question q3 = new Question("De catre ce poet roman este folosit 'Mitul Zburatorului'? ", "George Bacovia", "Nichita Stanescu", "Mihai Eminescu", 3);
        addQuestion(q3);
        Question q4 = new Question("Cine era sotia mesterului Manole", "Ana", "Maria", "Florica", 1);
        addQuestion(q4);
        Question q5 = new Question("Care sunt culorile snurului unui martisor?", "Alb si negru", "Alb si rosu", "Rosu si negru", 2);
        addQuestion(q5);
        Question q6 = new Question("In ce luna se sarbatoresc 'Babele'?", "Martie", "Noiembrie", "Iulie", 1);
        addQuestion(q6);
        Question q7 = new Question("Unde se afla padurea 'Hoia-Baciu'?", "Bucuresti", "Iasi", "Cluj", 3);
        addQuestion(q7);
        Question q8 = new Question("In ce an a fost construit 'Foisorul de foc'?", "1715", "1890", "1935", 2);
        addQuestion(q8);
        Question q9 = new Question("In ce secol a fost construit Coancul Bellu", "XX", "XVIII", "XIX", 3);
        addQuestion(q9);
        Question q10 = new Question("In timpul carui cutremur s-a prabusit turla Manastirii Chiajna?", "Cutremurul din 1977", "Cutremurul din 1986", "Cutremurul din 2004", 1);
        addQuestion(q10);

    }
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }
    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}