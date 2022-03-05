package com.example.subject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button subject1;
    private Button subject2;
    private Button subject3;

    private void changeActivity (int subjectNumber) {

        Intent intent = new Intent(this, SubjectActivity.class);

        switch (subjectNumber) {

            case 1:
                intent.putExtra("1", "1");
                break;

            case 2:
                intent.putExtra("2", "2");
                break;

            case 3:
                intent.putExtra("3", "3");
                break;

        }

        startActivity(intent);

    }

    private void setButtons () {

        subject1 = (Button) findViewById(R.id.subject1);
        subject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(1);
            }
        });

        subject2 = (Button) findViewById(R.id.subject2);
        subject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(2);
            }
        });

        subject3 = (Button) findViewById(R.id.subject3);
        subject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(3);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();
    }
}