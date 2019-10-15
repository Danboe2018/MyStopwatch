package com.webappclouds.mystopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_stopwatch extends Activity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }

    private void runTimer(){
        final TextView timeView = findViewById(R.id.time_view);
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        String time = String.format("%d:%03d:%02d",hours,minutes,secs);

        timeView.setText(time);

        if(running){
            
            seconds++;
        }
    }
}
