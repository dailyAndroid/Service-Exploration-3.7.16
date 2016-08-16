package com.example.hwhong.serviceexploration;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by hwhong on 7/3/16.
 */
//all services must extend the Service class
public class myservices extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //enables you to bind activity to a service
        //lets activity directly access the items in the service
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //starts service on command
        Toast.makeText(this, "Service has started", Toast.LENGTH_SHORT).show();
        //START_STICKY keeps the service going until the service is explicitly called to stop
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service is ended", Toast.LENGTH_SHORT).show();
    }
}
