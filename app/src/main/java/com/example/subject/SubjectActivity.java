package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SubjectActivity extends AppCompatActivity {

    private void showSubject (ArrayList<String> infoSubject) {

        TextView title = findViewById(R.id.subject_title);
        TextView description = findViewById(R.id.subject_description);
        TextView credits = findViewById(R.id.subject_credits);
        TextView teacher = findViewById(R.id.subject_teacher);

        title.setText(infoSubject.get(0));
        description.setText(infoSubject.get(1));
        credits.setText(infoSubject.get(2));
        teacher.setText(infoSubject.get(3));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        ArrayList<String> infoSubject = getIntent().getParcelableExtra("activityNumber");
        showSubject(infoSubject);
    }
}