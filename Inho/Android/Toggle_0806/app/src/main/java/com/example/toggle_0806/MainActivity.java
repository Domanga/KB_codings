package com.example.toggle_0806;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tv_btn;
    ToggleButton aircon_btn;
    ToggleButton fan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_btn = findViewById(R.id.tv_btn);
        aircon_btn = findViewById(R.id.aircon_btn);
        fan_btn = findViewById(R.id.fan_btn);

        tv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv_btn.isChecked() == true) {
                    tv_btn.setBackgroundResource(R.drawable.power_on);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    tv_btn.setBackgroundResource(R.drawable.power_off);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
            }
        });

        aircon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aircon_btn.isChecked() == true) {
                    aircon_btn.setBackgroundResource(R.drawable.power_on);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    aircon_btn.setBackgroundResource(R.drawable.power_off);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
            }
        });

        fan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(fan_btn.isChecked() == true) {
                    fan_btn.setBackgroundResource(R.drawable.power_on);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
                else {
                    fan_btn.setBackgroundResource(R.drawable.power_off);
                    Toast.makeText(getApplicationContext(), "TV ON", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}