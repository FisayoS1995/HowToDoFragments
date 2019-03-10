package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment {
    private TextView tvStatus;
    private Button btnShowStatus;

    private static final String KEY_TEXT= "text";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        tvStatus =  view.findViewById(R.id.tvstatus);
        if (savedInstanceState !=null) {
            tvStatus.setText(savedInstanceState.getString(KEY_TEXT));
        }
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnShowStatus = view.findViewById(R.id.btnShow);
        btnShowStatus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvStatus.setText("Clicked from Fragment One");
            }
        });
    };



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(KEY_TEXT, tvStatus.getText().toString());
        super.onSaveInstanceState(outState);
}
}


