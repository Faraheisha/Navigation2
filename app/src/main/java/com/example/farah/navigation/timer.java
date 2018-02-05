package com.example.farah.navigation;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class timer extends AppCompatActivity {

    Button btn;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        textview=(TextView) findViewById(R.id.timer);
        btn=(Button) findViewById(R.id.timerBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        textview.setText("Timer Started:"+millisUntilFinished/1000+"s");
                    }

                    @Override
                    public void onFinish() {
                        textview.setText("Timer");

                    }
                }.start();
            }
        });



    }

    }

