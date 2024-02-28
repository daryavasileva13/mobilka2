package com.example.sportscomplexapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainFragment2 extends Fragment {

    private static final String TAG = "MyApp";

    private ActivityResultLauncher<Intent> resultActivity2;

    public MainFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultActivity2 = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            TextView textName_return = requireActivity().findViewById(R.id.text_return);
                            Intent receivedIndent = result.getData();
                            String nameReceived = receivedIndent.getStringExtra("name");
                            textName_return.setText(nameReceived);
                        }
                    }
                }
        );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_main_linear, container, false);

        ImageView imageView = view.findViewById(R.id.image_cup);
        TextView textView = view.findViewById(R.id.text_sections);
        TextView textView2 = view.findViewById(R.id.text_gymnastics);
        TextView textView3 = view.findViewById(R.id.text_swimming);
        TextView textView4 = view.findViewById(R.id.text_acrobatics);
        TextView textView5 = view.findViewById(R.id.text_yoga);
        TextView textView6 = view.findViewById(R.id.text_football);
        TextView textView7 = view.findViewById(R.id.text_boxing);
        Button button = view.findViewById(R.id.button_sign_up);
        EditText sectionEditText = view.findViewById(R.id.section);
        TextView textName_return = view.findViewById(R.id.text_return);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Кнопка нажата");

                String sectionToPass = sectionEditText.getText().toString();

                Intent intent = new Intent(requireActivity(), MainFragment3.class);
                intent.putExtra("Секция", sectionToPass);
                resultActivity2.launch(intent);
            }
        });

        return view;
    }
}