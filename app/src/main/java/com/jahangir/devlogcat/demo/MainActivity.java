package com.jahangir.devlogcat.demo;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import com.jahangir.devlogcat.DevLog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        // System Logcat-এও print করবে
        Log.d(TAG, "System Logcat: onCreate");
        
        // DevLogCat-এ পাঠাবে
        DevLog.d(TAG, "onCreate: Activity created");
        
        // Bundle check
        if (savedInstanceState != null) {
            DevLog.i(TAG, "onCreate: Restoring from saved state");
        } else {
            DevLog.i(TAG, "onCreate: Fresh start");
        }
        
        new android.os.Handler().postDelayed(() -> {
            String test = null;
            test.length(); //  NullPointerException
        }, 3000);
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        DevLog.d(TAG, "onStart: Activity becoming visible");
        Log.d(TAG, "System Logcat: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        DevLog.d(TAG, "onResume: Activity ready for interaction");
        Log.d(TAG, "System Logcat: onResume");
    }

    @Override
    protected void onPause() {
        DevLog.d(TAG, "onPause: Activity partially visible");
        Log.d(TAG, "System Logcat: onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        DevLog.d(TAG, "onStop: Activity no longer visible");
        Log.d(TAG, "System Logcat: onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        DevLog.d(TAG, "onDestroy: Activity being destroyed");
        Log.d(TAG, "System Logcat: onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        DevLog.d(TAG, "onRestart: Activity restarting");
        Log.d(TAG, "System Logcat: onRestart");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        DevLog.d(TAG, "onSaveInstanceState: Saving state");
        Log.d(TAG, "System Logcat: onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        DevLog.d(TAG, "onRestoreInstanceState: Restoring state");
        Log.d(TAG, "System Logcat: onRestoreInstanceState");
    }

    @Override
    public void onBackPressed() {
        DevLog.d(TAG, "onBackPressed: Back button pressed");
        Log.d(TAG, "System Logcat: onBackPressed");
        super.onBackPressed();
    }
}