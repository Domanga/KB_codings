package com.example.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sendBtn;
    TextView ShowMsg;
    EditText infoMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = findViewById(R.id.sendBtn);
        ShowMsg = findViewById(R.id.ShowMsg);
        infoMsg = findViewById(R.id.infoMsg);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = infoMsg.getText().toString(); 
                log.d(tag:"MainActivity_OnCreate", msg : "data:")
            }
        });

    }

}