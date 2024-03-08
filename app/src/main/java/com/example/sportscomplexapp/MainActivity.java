package com.example.sportscomplexapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    public MainActivity() {
        super(R.layout.activity_main_relative);
    }
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_relative);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, Fragment1.class, null)
                    .commit();
        }
    }
}






//        ImageView imageView = (ImageView)findViewById(R.id.imageView_sports_academy);
//        ImageView imageView2 = (ImageView)findViewById(R.id.imageView_legs);
//        TextView textView = (TextView)findViewById(R.id.text_opening);
//        TextView textView2 = (TextView)findViewById(R.id.text_opening_hours);
//        TextView textView3 = (TextView)findViewById(R.id.text_contacts);
//
//        Button button = findViewById(R.id.button_our_sections);

//        openFragment();

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "Кнопка нажата (Программная реализация)");
//            }
//        });





//    public void onButtonClick(View view) {
//        Log.i(TAG, "Кнопка нажата");
//        Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }





//    public void openFragment(Fragment fragment){
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, Fragment1.class, null).commit();
//    }







