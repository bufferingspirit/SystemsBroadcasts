package com.example.admin.systemsbroadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class SystemReceiver extends BroadcastReceiver {

    TextView tv;

    SystemReceiver(){}

    SystemReceiver(TextView tv){
        this.tv = tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        switch(intent.getAction()) {

            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                tv.append("Airplane Mode Toggled::");
                break;
            case Intent.ACTION_HEADSET_PLUG:
                tv.append("Headset Plugged In::");
                break;
            case Intent.ACTION_POWER_CONNECTED:
                tv.append("Power Connected::");
                break;
            case Intent.ACTION_SCREEN_OFF:
                tv.append("Screen Off::");
                break;
            case Intent.ACTION_CAMERA_BUTTON:
                tv.append("Camera Button Pressed::");
                break;
        }

    }
}
