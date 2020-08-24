package com.jih.weather_project.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.jih.weather_project.R;
import com.jih.weather_project.fragment.WeatherFragment;
import com.jih.weather_project.fragment.WeatherFragment2;
import com.jih.weather_project.util.GetXmlTask;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;
    WeatherFragment weatherFragment;
    WeatherFragment2 weatherFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherFragment = new WeatherFragment();
        weatherFragment2 = new WeatherFragment2();

        bnView = findViewById(R.id.nav_view);
        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.tab1:
                        Toast.makeText(MainActivity.this, "홈 메뉴", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, weatherFragment).commit();
                        return true;
                    case R.id.tab2:
                        Toast.makeText(MainActivity.this, "설정 메뉴", Toast.LENGTH_SHORT).show();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, weatherFragment2).commit();
                        return true;
                    case R.id.tab3:
                        Toast.makeText(MainActivity.this, "날씨 메뉴", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), WeatherActivity.class);
                        startActivity(intent);
                        return true;
                }
                return false;
            }
        });
    }

//    public void onSearchWeather(View v) {
//        GetXmlTask task = new GetXmlTask(this);
//        switch (v.getId()) {
//
//            case R.id.busan:
//                task.execute("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=98&gridy=76");
//                break;
//            case R.id.gangwon:
//                task.execute("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=73&gridy=134");
//                break;
//        }
//    }
}