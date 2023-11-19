package com.example.activitylifecyclemonitor2023;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button start_2 = findViewById (R.id.button_3);
        start_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        Button start = findViewById (R.id.button_2);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Status", "SecondActivity:onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Status", "SecondActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Status", "SecondActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Status", "SecondActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Status", "SecondActivity:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Status", "SecondActivity:onDestroy");
    }
}