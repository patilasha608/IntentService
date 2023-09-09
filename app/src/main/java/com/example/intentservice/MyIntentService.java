package com.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // This method runs on a background thread.
        // Place your background task logic here.
        String inputText = intent.getStringExtra("inputText");

        // Simulate some background work.
        for (int i = 0; i < 5; i++) {
            Log.d(TAG, "Running service: " + inputText + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // The service will automatically stop itself when the work is done.
    }
}

