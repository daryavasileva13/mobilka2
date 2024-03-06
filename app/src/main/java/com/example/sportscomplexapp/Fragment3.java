package com.example.sportscomplexapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class Fragment3 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.activity_main, container, false);

        View view = inflater.inflate(R.layout.activity_main, container, false);
        TextView textView = view.findViewById(R.id.textGet);

        getParentFragmentManager().setFragmentResultListener("requestKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey,
                                         @NonNull Bundle bundle) {
                // We use a String here, but any type that can bput in a Bundle is supported
                String result = bundle.getString("bundleKey");
                textView.setText(result);
            }
        });

        return view;

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView = view.findViewById(R.id.textViewTitle);
        //EditText editText = view.findViewById(R.id.editTextTraining);
        EditText editText3 = view.findViewById(R.id.editTextLastName);
        EditText editText4 = view.findViewById(R.id.editTextPhoneNumber);
        Button button = view.findViewById(R.id.buttonSubmit);
        Button button2 = view.findViewById(R.id.button_end);

        EditText editText_name = view.findViewById(R.id.editTextFirstName);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle result = new Bundle();

                String sectionToPass = editText_name.getText().toString();

                result.putString("bundleKey2", sectionToPass);
                getParentFragmentManager().setFragmentResult("requestKey2", result);


                Log.i(TAG, "Назад (Программная реализация)");
                goBackToFragment2();
            }
        });

    }


    public void goBackToFragment2(){
        Fragment backFragment = new Fragment2();

        Bundle bundle = new Bundle();
        // Добавьте данные в Bundle, если необходимо

        backFragment.setArguments(bundle);

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, backFragment)
                .commit();

    }



}
