package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        ImageView imageView = (ImageView)findViewById(R.id.image_cup);
        TextView textView = (TextView)findViewById(R.id.text_sections);
        TextView textView2 = (TextView)findViewById(R.id.text_gymnastics);
        TextView textView3 = (TextView)findViewById(R.id.text_swimming);
        TextView textView4 = (TextView)findViewById(R.id.text_acrobatics);
        TextView textView5 = (TextView)findViewById(R.id.text_yoga);
        TextView textView6 = (TextView)findViewById(R.id.text_football);
        TextView textView7 = (TextView)findViewById(R.id.text_boxing);

        Button button = findViewById(R.id.button_sign_up);

    }
    public void onButtonClick2(View view) {
        Log.i(TAG, "Кнопка нажата");
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}