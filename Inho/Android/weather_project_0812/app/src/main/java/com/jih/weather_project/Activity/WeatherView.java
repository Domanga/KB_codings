package com.jih.weather_project.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jih.weather_project.R;
import com.jih.weather_project.adapter.OnWeatherItemClickListener;
import com.jih.weather_project.adapter.WeatherAdapter;
import com.jih.weather_project.model.MyWeather;

import java.util.ArrayList;

public class WeatherView extends AppCompatActivity {
    WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_view);
        ArrayList<MyWeather> weatherArrayList = (ArrayList<MyWeather>) getIntent().getSerializableExtra("MyWeather");
        String city = getIntent().getStringExtra("city");
        setTitle(city + " 날씨 정보");

        for(int i=0;i<weatherArrayList.size();i++) {
            Log.d("WeatherView", "시간: " + weatherArrayList.get(i).getTime());
            Log.d("WeatherView", "날짜: " + weatherArrayList.get(i).getStrDate());
            Log.d("WeatherView", "온도: " + weatherArrayList.get(i).getTemp());
            Log.d("WeatherView", "습도: " + weatherArrayList.get(i).getReh());
            Log.d("WeatherView", "강수확률: " + weatherArrayList.get(i).getPop());
            Log.d("WeatherView", "날씨: " + weatherArrayList.get(i).getWeather());
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        weatherAdapter = new WeatherAdapter();

        for(int i=0; i<weatherArrayList.size();i++) {
            weatherAdapter.addItem(weatherArrayList.get(i));
        }
        recyclerView.setAdapter((weatherAdapter));
        weatherAdapter.setOnItemClickListener(new OnWeatherItemClickListener() {
            @Override
            public void onItemClick(WeatherAdapter.ViewHolder holder, View view, int position) {
                MyWeather item = weatherAdapter.getItem(position);
                Log.d("WeatherView", "날짜: " + item.getStrDate());
                Log.d("WeatherView", "시간: " + item.getTime());
                Log.d("WeatherView", "날씨: " + item.getWeather());
                Intent intent = new Intent(getApplicationContext(), WeatherDetail.class);
                startActivity(intent);
            }
        });
    }
}