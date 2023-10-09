package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("1");
        setContentView(R.layout.activity_main);
        HourForecast hf = new HourForecast();
        hf.setTemperature(32.4);
        System.out.println("2");
        //TextView tv_message = findViewById(R.id.tv_message);
        //String text = getString(R.string.str_tv_message, hf.getTemperature());
        //tv_message.setText(text);
        System.out.println("3");

    }
}