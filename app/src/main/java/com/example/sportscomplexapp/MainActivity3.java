package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textViewTitle);
        //EditText editText = (EditText)findViewById(R.id.editTextTraining);
        EditText editText2 = (EditText)findViewById(R.id.editTextFirstName);
        EditText editText3 = (EditText)findViewById(R.id.editTextLastName);
        EditText editText4 = (EditText)findViewById(R.id.editTextPhoneNumber);
        Button button = findViewById(R.id.buttonSubmit);
        Button button2 = findViewById(R.id.button_end);

        TextView sectionTextView = (TextView)findViewById(R.id.textGet);

        String sectionReceived = getIntent().getStringExtra("Секция");

        sectionTextView.setText(sectionReceived);

//        String receivedData = getIntent().getStringExtra("key");

//        textView2.setText(receivedData);

//
//        EditText editText = findViewById(R.id.section);
//        editText.setText(receivedData);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Кнопка нажата");
                finish();

            }
        });


    }
//    public void onButtonClick2(View view) {
//        Log.i(TAG, "Кнопка нажата");
//        finish();
//    }
}