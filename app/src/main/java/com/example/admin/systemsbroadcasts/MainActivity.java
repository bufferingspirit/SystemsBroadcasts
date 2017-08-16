package com.example.admin.systemsbroadcasts;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvActions;
    SystemReceiver sys;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvActions = (TextView) findViewById(R.id.tvActions);

        sys = new SystemReceiver(tvActions);

    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.CAMERA_BUTTON");
        registerReceiver(sys, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //unregisterReceiver(sys);
    }


}
