package com.concordia.cejv669.layoutorientationclass6;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String eventMessage;
    final String logTag = "lab3ab_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventMessage = "Event: OnCreate";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
        TextView tv = findViewById(R.id.result);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            tv.setText("Hi, I'm landscape!");
        }

    }

    @Override
    protected void onStart() {
        super.onStart();

        eventMessage = "Event: OnStart";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        eventMessage = "Event: onResume";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        eventMessage = "Event: onPause";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        eventMessage = "Event: onStop";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        eventMessage = "Event: onDestroy";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        eventMessage = "Event: onRestart";
        Log.d(logTag, eventMessage);
        Toast.makeText(this, eventMessage, Toast.LENGTH_LONG).show();
    }
}
