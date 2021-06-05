package com.example.test_proiect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLegende();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLegendeUrbane();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTraditii();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZicale();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainQuiz();
            }
        });

    }

    public void openLegende(){
        Intent intent = new Intent(this, LegendeActivity.class);
        startActivity(intent);
    }

    public void openLegendeUrbane(){
        Intent intent = new Intent(this, LegendeUrbaneActivity.class);
        startActivity(intent);
    }

    public void openTraditii(){
        Intent intent = new Intent(this, TraditiiActivity.class);
        startActivity(intent);
    }

    public void openZicale(){
        Intent intent = new Intent(this, ZicaleActivity.class);
        startActivity(intent);
    }

    public void openMainQuiz(){
        Intent intent = new Intent(this, MainQuizActivity.class);
        startActivity(intent);
    }

}