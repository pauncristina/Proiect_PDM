package com.example.test_proiect;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        ImageView img = findViewById(R.id.imagine);
        TextView nameTxt = findViewById(R.id.titlu);
        TextView desc = findViewById(R.id.descriere);

        String titlu = "Titlul nu este pus";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            titlu = extras.getString("titlu");
            img.setImageResource(extras.getInt("imagine"));
            desc.setText(extras.getString("descriere"));
        }

        nameTxt.setText(titlu);

    }
}