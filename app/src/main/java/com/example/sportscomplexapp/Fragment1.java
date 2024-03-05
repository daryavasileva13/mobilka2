package com.example.sportscomplexapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreateView");

        return inflater.inflate(R.layout.fragment1, container, false);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        ImageView imageView = view.findViewById(R.id.imageView_sports_academy);
        ImageView imageView2 = view.findViewById(R.id.imageView_legs);
        TextView textView = view.findViewById(R.id.text_opening);
        TextView textView2 = view.findViewById(R.id.text_opening_hours);
        TextView textView3 = view.findViewById(R.id.text_contacts);

        Button button = view.findViewById(R.id.button_our_sections);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log Log = null;
                Log.i(TAG, "Кнопка нажата (Программная реализация)");
                openNextFragment();
            }
        });

    }

//        public void onButtonClick(View view) {
//        Log.i(TAG, "Кнопка нажата");
//        Intent intent = new Intent(this, Fragment2.class);
//        startActivity(intent);
//    }

//    public void openNextFragment(){
//        Fragment nextFragment = new Fragment2();
//        nextFragment.setArguments();
//
//        getActivity()
//                .getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.fragment_container_view, nextFragment)
//                .commit();
//    }


    public void openNextFragment(){
        Fragment nextFragment = new Fragment2();

        Bundle bundle = new Bundle();
        // Добавьте данные в Bundle, если необходимо

        nextFragment.setArguments(bundle);

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, nextFragment)
                .commit();
    }


    public void onViewStateRestored (@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(getContext(),"onViewStateRestored", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onSaveInstanceState");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
    }



}
