package vk.my.code.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HourForecast forecast = new HourForecast(32.4, 1, 4, 12, 6, 21,26);
        TextView tv = findViewById(R.id.tv_message);
        String text = getString(R.string.str_tv_message, forecast.getTemperature());
        tv.setText(text);
//        tv.setText(String.valueOf(forecast.getTemperature()));


    }
}