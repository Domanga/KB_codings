package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus, minus, mul, div;
    EditText first, second;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mul = findViewById(R.id.multiple);
        div = findViewById(R.id.divide);

        first = findViewById(R.id.first_number);
        second = findViewById(R.id.second_number);
        result = findViewById(R.id.answer);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            double a,b;
            double res;
            a = Double.parseDouble(first.getText().toString());
            b = Double.parseDouble(second.getText().toString());

            res = a+b;
            result.setText(String.valueOf(res));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b;
                double res;
                a = Double.parseDouble(first.getText().toString());
                b = Double.parseDouble(second.getText().toString());

                res = a-b;
                result.setText(String.valueOf(res));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b;
                double res;
                a = Double.parseDouble(first.getText().toString());
                b = Double.parseDouble(second.getText().toString());

                res = a*b;
                result.setText(String.valueOf(res));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b;
                double res;
                a = Double.parseDouble(first.getText().toString());
                b = Double.parseDouble(second.getText().toString());

                res = a/b;
                result.setText(String.valueOf(res));
            }
        });
    }


}