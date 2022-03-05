package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SubjectActivity extends AppCompatActivity {
    public static Intent newIntent(Context packageContext) {
        Intent intent = new Intent(packageContext, SubjectActivity.class);
        return intent;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
    }
}