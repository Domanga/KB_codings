package com.example.quiz_0807;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Step1 extends AppCompatActivity {
    Button OK, NO, next, home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        OK = findViewById(R.id.ok_btn);
        NO = findViewById(R.id.NO_btn);
        next = findViewById(R.id.next);
        home = findViewById(R.id.home);
        next.setEnabled(false);

        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "정답입니다!, \n 다음 퀴즈로 진행하세요.", Toast.LENGTH_SHORT).show();
                next.setEnabled(true);
            }
        });

        NO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "오답입니다!, \n 다시 퀴즈를 풀어보세요.", Toast.LENGTH_SHORT).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}