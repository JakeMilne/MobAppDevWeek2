package com.example.myapplication;

public class HourForecast {
    private double temperature;
    private int wind;
    private double precipitationPercent;
    private double humidity;
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipitationPercent() {
        return precipitationPercent;
    }

    public void setPrecipitationPercent(double precipitationPercent) {
        this.precipitationPercent = precipitationPercent;
    }
}
