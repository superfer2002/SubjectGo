package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity {

    private void showSubject (ArrayList<Integer> infoSubject) {

        TextView textView = findViewById(R.id.subject_title);
        textView.setText(infoSubject.get(0));

        TextView textView2 = findViewById(R.id.subject_description);
        textView2.setText(infoSubject.get(1));

        TextView textView3 = findViewById(R.id.subject_credits);
        textView3.setText(infoSubject.get(2).toString());

        TextView textView4 = findViewById(R.id.subject_teacher);
        textView4.setText(infoSubject.get(3));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        ArrayList<Integer> infoSubject = getIntent().getIntegerArrayListExtra("activityNumber");
        showSubject(infoSubject);
    }
}