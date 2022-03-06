package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button subject1;
    private Button subject2;
    private Button subject3;
    private ArrayList<Subject> subjectArrayList = new ArrayList<>();
    private ArrayList<Integer> infoArrayList = new ArrayList<>();

    private void fillSubjects () {

        subjectArrayList.add(new Subject(R.string.subject1, R.string.subject1_LongDesc, 6, R.string.subject1_teacher));
        subjectArrayList.add(new Subject(R.string.subject2, R.string.subject2_LongDesc, 6, R.string.subject2_teacher));
        subjectArrayList.add(new Subject(R.string.subject3, R.string.subject3_LongDesc, 6, R.string.subject3_teacher));

    }

    private void changeActivity (int subjectNumber) {

        Intent intent = new Intent(this, SubjectActivity.class);

        infoArrayList.add(subjectArrayList.get(subjectNumber).getTitle());
        infoArrayList.add(subjectArrayList.get(subjectNumber).getDescription());
        infoArrayList.add(subjectArrayList.get(subjectNumber).getCredits());
        infoArrayList.add(subjectArrayList.get(subjectNumber).getTeacher());

        intent.putExtra("activityNumber", infoArrayList);
        startActivity(intent);
        infoArrayList.clear(); //IMPORTANT PER A NETEJAR L'ARRAY I AGAFAR UNA ALTRA ASSIGNATURA

    }

    private void setButtons () {

        subject1 = (Button) findViewById(R.id.subject1);
        subject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(0);
            }
        });

        subject2 = (Button) findViewById(R.id.subject2);
        subject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(1);
            }
        });

        subject3 = (Button) findViewById(R.id.subject3);
        subject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(2);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();
        fillSubjects();
    }
}