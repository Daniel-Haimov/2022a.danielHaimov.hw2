package com.hw.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hw.myapplication.R;

public class Activity_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        findViews();
        initListeners();
    }

    private void initListeners() {
        // TODO set listeners and update values in SP
    }

    private void findViews() {
        // TODO find settings view
    }
}