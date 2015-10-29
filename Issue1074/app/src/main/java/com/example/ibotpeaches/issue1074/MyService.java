package com.example.ibotpeaches.issue1074;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {

    public MyService() {
        super("MyService");
    }

    @Override
    public void onHandleIntent(Intent intent) {
        Log.w("Apktool", "Issue1074 - Boot Completed");
    }
}
