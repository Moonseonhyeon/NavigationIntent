package com.linda.navigationintentex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SubActivity extends AppCompatActivity {
    private static final String TAG = "SubActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }
}