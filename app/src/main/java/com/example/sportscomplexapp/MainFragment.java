
package com.example.sportscomplexapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class MainFragment extends Fragment {
    private static final String TAG = "MyApp";

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_main_relative, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView_sports_academy);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.imageView_legs);
        TextView textView = (TextView) view.findViewById(R.id.text_opening);
        TextView textView2 = (TextView) view.findViewById(R.id.text_opening_hours);
        TextView textView3 = (TextView) view.findViewById(R.id.text_contacts);
        Button button = view.findViewById(R.id.button_our_sections);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Кнопка нажата");
                Intent intent = new Intent(getActivity(), MainFragment2.class);
                startActivity(intent);
            }
        });

        return view;
    }
}