package com.jih.weather_project.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import com.jih.weather_project.R;
import com.jih.weather_project.model.MyWeather;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> implements OnWeatherItemClickListener {
    ArrayList<MyWeather> items = new ArrayList<>();
    OnWeatherItemClickListener listener;

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.weather_list, parent, false);
        return new ViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
        MyWeather item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(MyWeather item) {
        items.add(item);
    }

    public MyWeather getItem(int position) {
        return items.get(position);
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if (listener != null) {
            listener.onItemClick(holder, view, position);
        }
    }

    public void setOnItemClickListener(OnWeatherItemClickListener listener) {
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView date, time, weather;
        ImageView weather_img;

        public ViewHolder(@NonNull View itemView, final OnWeatherItemClickListener listener) {
            super(itemView);

            date = itemView.findViewById(R.id.wh_date);
            time = itemView.findViewById(R.id.wh_time);
            weather = itemView.findViewById(R.id.wh_weather);
            weather_img = itemView.findViewById(R.id.wh_icon);

            itemView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if(listener != null) {
                        listener.onItemClick(ViewHolder.this, view, position);
                    }
                }
            }));
        }

        public void setItem(MyWeather item) {
            date.setText(item.getStrDate());
            time.setText(item.getTime());
            weather.setText(item.getWeather());

            weather_img.setImageResource(getWeatherImage(item.getWeather()));
        }

        public int getWeatherImage(String wfKor) {
            int image = 0;
            switch (wfKor) {
                case "맑음":
                    image = R.drawable.sunny_image_1;
                    break;
                case "구름 조금":
                    image = R.drawable.cloudy_s_image_1;
                    break;
                case "구름 많음":
                    image = R.drawable.cloudy_l_image_1;
                    break;
                case "흐림":
                    image = R.drawable.foggy_image_1;
                    break;
                case "비":
                    image = R.drawable.rainy_image_1;
                    break;
                case "눈":
                    image = R.drawable.snowy_image_1;
                    break;
                case "눈/비":
                    image = R.drawable.snowy_rainy_image_1;
                    break;
            }
            return image;
        }
    }
}