//import android.os.Bundle;
//import androidx.fragment.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class MainFragment3 extends Fragment {
//    private static final String TAG = "MyApp";
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_main, container, false);
//
//        TextView textView = (TextView) view.findViewById(R.id.textViewTitle);
//        EditText editText3 = (EditText) view.findViewById(R.id.editTextLastName);
//        EditText editText4 = (EditText) view.findViewById(R.id.editTextPhoneNumber);
//        Button button = view.findViewById(R.id.buttonSubmit);
//        Button button2 = view.findViewById(R.id.button_end);
//        TextView sectionTextView = (TextView) view.findViewById(R.id.textGet);
//        EditText editTextName = (EditText) view.findViewById(R.id.editTextFirstName);
//
//        String sectionReceived = requireActivity().getIntent().getStringExtra("Секция");
//        sectionTextView.setText(sectionReceived);
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name = editTextName.getText().toString();
//                Intent intent_return = new Intent();
//                intent_return.putExtra("name", name);
//                requireActivity().setResult(Activity.RESULT_OK, intent_return);
//                requireActivity().finish();
//            }
//        });
//
//        return view;
//    }
//}

package com.example.sportscomplexapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainFragment3 extends Fragment {
    private static final String TAG = "MyApp";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        TextView textView = view.findViewById(R.id.textViewTitle);
        EditText editText3 = view.findViewById(R.id.editTextLastName);
        EditText editText4 = view.findViewById(R.id.editTextPhoneNumber);
        Button button = view.findViewById(R.id.buttonSubmit);
        Button button2 = view.findViewById(R.id.button_end);
        TextView sectionTextView = view.findViewById(R.id.textGet);
        EditText editTextName = view.findViewById(R.id.editTextFirstName);

        String sectionReceived = requireActivity().getIntent().getStringExtra("Секция");
        sectionTextView.setText(sectionReceived);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                Intent intent_return = new Intent();
                intent_return.putExtra("name", name);
                requireActivity().setResult(Activity.RESULT_OK, intent_return);
                requireActivity().finish();
            }
        });

        return view;
    }
}