package com.example.crpito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {
public Button register;
public EditText namee ;
    public TextInputEditText pass ;
    public TextInputEditText mail ;
    public TextInputEditText  number;
    public TextInputEditText passa;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

       findViewById(R.id.lgn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FirebaseDatabase database = FirebaseDatabase.getInstance();
               DatabaseReference myRef = database.getReference().child("users").child("id"); //location to put, can be anything you want ...
               myRef.setValue("TEST");
           }
       });
    }
}