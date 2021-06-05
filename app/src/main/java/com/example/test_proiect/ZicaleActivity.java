package com.example.test_proiect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class ZicaleActivity extends AppCompatActivity {
    GridView grid;

    int icons[] = {R.drawable.z1, R.drawable.z2, R.drawable.z3, R.drawable.z4, R.drawable.z5, R.drawable.z6, R.drawable.z7};
    String name[] = {"A umbla după cai morți să le ieie potcoavele", "Aurul și în gunoi, tot aur rămâne", "Bate șaua să priceapă iapa", "Bate și ți se va deschide, cere și ți se va da", "Bine faci, bine găsești", "Ce naște din pisică, șoareci mănâncă", "Fier pe fier ascute"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zicale);
        setTitle("Zicale");

        grid = (GridView)findViewById(R.id.datagrid);
        ZicaleAdapter obj = new ZicaleAdapter(this, name, icons);
        grid.setAdapter(obj);
    }
}