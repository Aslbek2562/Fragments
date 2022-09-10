package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment2 extends Fragment {

    Button button;
    Button button1;
    EditText editText;
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank2, container, false);
        button=view.findViewById(R.id.button3);
        editText=view.findViewById(R.id.edittext1);
        textView=view.findViewById(R.id.textview1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "xaxaxaxa", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText().toString());
            }
        });

        return view;
    }
}