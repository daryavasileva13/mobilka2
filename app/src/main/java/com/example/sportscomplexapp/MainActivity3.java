package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textViewTitle);
        EditText editText = (EditText)findViewById(R.id.editTextTraining);
        EditText editText2 = (EditText)findViewById(R.id.editTextFirstName);
        EditText editText3 = (EditText)findViewById(R.id.editTextLastName);
        EditText editText4 = (EditText)findViewById(R.id.editTextPhoneNumber);
        Button button = findViewById(R.id.buttonSubmit);
        Button button2 = findViewById(R.id.button_end);




    }
}