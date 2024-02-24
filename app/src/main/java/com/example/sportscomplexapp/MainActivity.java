package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);
        ImageView imageView = (ImageView)findViewById(R.id.imageView_sports_academy);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView_legs);
        TextView textView = (TextView)findViewById(R.id.text_opening);
        TextView textView2 = (TextView)findViewById(R.id.text_opening_hours);
        TextView textView3 = (TextView)findViewById(R.id.text_contacts);

        Button button = findViewById(R.id.button_our_sections);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "Кнопка нажата (Программная реализация)");
//            }
//        });
    }
    public void onButtonClick(View view) {
        Log.i(TAG, "Кнопка нажата");
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}


