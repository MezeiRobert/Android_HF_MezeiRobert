package com.example.hazi6;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Fragment1 fragment1 = new Fragment1();
            Fragment2 fragment2 = new Fragment2();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView2, fragment1)
                    .replace(R.id.fragmentContainerView3, fragment2)
                    .commit();
        } else {
            Fragment1 fragment1 = new Fragment1();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment1)
                    .commit();
        }
    }
}
