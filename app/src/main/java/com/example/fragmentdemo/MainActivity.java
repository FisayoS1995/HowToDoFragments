package com.example.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private static final String TAG_FRAGMENT_ONE ="fragmentOne";
    private static final String TAG_FRAGMENT_TWO ="fragmentTwo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment firstFragment = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT_ONE);
        Fragment secondFragment = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT_TWO);
        if (firstFragment == null || secondFragment == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frameOne, new FragmentOne(), TAG_FRAGMENT_ONE)
                    .add(R.id.frameTwo, new FragmentTwo(), TAG_FRAGMENT_TWO)
                    .commit();//you can perform many transaction , only when you add fragments
        }


    }
}
