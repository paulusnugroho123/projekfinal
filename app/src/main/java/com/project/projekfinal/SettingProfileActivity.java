package com.project.projekfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile);
        getSupportActionBar().setTitle("Setting Profile");
    }
}
