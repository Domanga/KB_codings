package com.example.invisible_0806;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox Agree;
    TextView question;
    RadioGroup rGroup;
    Button choose_btn;
    ImageView Game_Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Agree = findViewById(R.id.Agree);
        question = findViewById(R.id.question);
        rGroup = findViewById(R.id.rGroup);
        choose_btn = findViewById(R.id.choose_btn);
        Game_Image = findViewById(R.id.Game_image);

        Agree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Agree.isChecked() == true) {
                    question.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    choose_btn.setVisibility(View.VISIBLE);
                }
                else {
                    question.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    choose_btn.setVisibility(View.INVISIBLE);
                }
            }
        });

        choose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup.getCheckedRadioButtonId()) {
                    case R.id.r_wind:
                        Game_Image.setImageResource(R.drawable.baram_image);
                        break;
                    case R.id.r_stone:
                        Game_Image.setImageResource(R.drawable.stone_image);
                        break;
                    case R.id.r_kart:
                        Game_Image.setImageResource(R.drawable.kartrider);
                        break;
                }
            }
        });
    }
}