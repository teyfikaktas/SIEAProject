package com.example.crpito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class main extends AppCompatActivity {
ArrayList<Button > buttons ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn = findViewById(R.id.clicker);
        buttons.add(btn);

        for(Button i: buttons) i.setVisibility(View.INVISIBLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}