//package com.example.sportscomplexapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class MainActivity3 extends AppCompatActivity {
//    private static final String TAG = "MyApp";
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        TextView textView = (TextView)findViewById(R.id.textViewTitle);
//        //EditText editText = (EditText)findViewById(R.id.editTextTraining);
//        EditText editText3 = (EditText)findViewById(R.id.editTextLastName);
//        EditText editText4 = (EditText)findViewById(R.id.editTextPhoneNumber);
//        Button button = findViewById(R.id.buttonSubmit);
//
//
//
//
//        Button button2 = findViewById(R.id.button_end);
//        String sectionReceived = getIntent().getStringExtra("Секция");
//
//        TextView sectionTextView = (TextView)findViewById(R.id.textGet);
//        sectionTextView.setText(sectionReceived);
//        EditText editTextName = (EditText)findViewById(R.id.editTextFirstName);
//
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i(TAG, "Кнопка нажата");
//
//                String name = editTextName.getText().toString();
////                User user = new User(name);
//
//                Intent intent_return = new Intent();
//                intent_return.putExtra("name", name);
//                setResult(Activity.RESULT_OK, intent_return);
//
//                finish();
//
//            }
//        });
//
//
//    }
//
//}