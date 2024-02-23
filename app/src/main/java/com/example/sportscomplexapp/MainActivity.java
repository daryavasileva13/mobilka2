package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);
        ImageView imageView = (ImageView)findViewById(R.id.imageView_sports_academy);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView_legs);
        TextView textView = (TextView)findViewById(R.id.text_opening);
        TextView textView2 = (TextView)findViewById(R.id.text_opening_hours);
        TextView textView3 = (TextView)findViewById(R.id.text_contacts);

    }
}