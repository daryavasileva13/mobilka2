package com.example.sportscomplexapp;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ImageView imageView = view.findViewById(R.id.image_cup);
        TextView textView = view.findViewById(R.id.text_sections);
        TextView textView2 = view.findViewById(R.id.text_gymnastics);
        TextView textView3 = view.findViewById(R.id.text_swimming);
        TextView textView4 = view.findViewById(R.id.text_acrobatics);
        TextView textView5 = view.findViewById(R.id.text_yoga);
        TextView textView6 = view.findViewById(R.id.text_football);
        TextView textView7 = view.findViewById(R.id.text_boxing);

        Button button = view.findViewById(R.id.button_sign_up);
        Button button_back = view.findViewById(R.id.button_end2);

        EditText sectionEditText = view.findViewById(R.id.section);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log Log = null;
                Log.i(TAG, "Кнопка нажата (Программная реализация)");
                openNextFragment2();
            }
        });


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Назад (Программная реализация)");
                goBackToFragment1();
            }
        });


    }

    public void openNextFragment2(){
        Fragment nextFragment = new Fragment3();

        Bundle bundle = new Bundle();
        // Добавьте данные в Bundle, если необходимо

        nextFragment.setArguments(bundle);

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, nextFragment)
                .commit();
    }

    public void goBackToFragment1(){
        Fragment backFragment = new Fragment1();

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
