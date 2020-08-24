package com.jih.weather_project.model;

import java.io.Serializable;

public class MyWeather implements Serializable {
    private String StrDate;
    private String time;
    private String temp;
    private String reh;
    private String pop;
    private String weather;

    public MyWeather(String strDate, String time, String temp, String reh, String pop, String weather) {
        StrDate = strDate;
        this.time = time;
        this.temp = temp;
        this.reh = reh;
        this.pop = pop;
        this.weather = weather;
    }

    public String getStrDate() {
        return StrDate;
    }

    public void setStrDate(String strDate) {
        StrDate = strDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getReh() {
        return reh;
    }

    public void setReh(String reh) {
        this.reh = reh;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
