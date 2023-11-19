package com.example.activitylifecyclemonitor2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button start = findViewById (R.id.button_4);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        Button start_2 = findViewById (R.id.button_5);
        start_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status", "ThirdActivity:onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status", "ThirdActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status", "ThirdActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status", "ThirdActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status", "ThirdActivity:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status", "ThirdActivity:onDestroy");
    }
}