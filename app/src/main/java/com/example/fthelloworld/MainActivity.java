package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private boolean isHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.isHelloWorld = true;
    }

    public void onBtnMainCLick(View view) {
        if(this.isHelloWorld){
            this.tvMain.setText("smth new");
        }
        else{
            this.tvMain.setText("Hello World!");
        }
        this.isHelloWorld = !this.isHelloWorld;
    }
}
