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

public class FragmentTwo extends Fragment {

    private TextView tvStatus;
    private Button btnShowStatus;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        tvStatus =  view.findViewById(R.id.tvstatus);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnShowStatus = view.findViewById(R.id.btnShow);
        btnShowStatus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvStatus.setText("Clicked from Fragment Two");
            }
        });
    }
}
