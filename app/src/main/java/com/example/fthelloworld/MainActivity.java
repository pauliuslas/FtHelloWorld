package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnMainSpausk(View view) {
        TextView tvMain1 = (TextView)findViewById(R.id.tvMain);
        tvMain1.setText("Puikiai atlikta užduotis");

    }

    public void onBtnMainColor(View view) {
        TextView tvMain1 = (TextView) findViewById(R.id.tvMain);
        tvMain1.setTextColor(Color.parseColor("#FF018786"));
    }
}