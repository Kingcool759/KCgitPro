package com.example.kcgitpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(App.getContext(),"hhahha~",Toast.LENGTH_LONG).show();
        // dev_commit-1
        Log.i(TAG, "commit-1");
        // dev_commit-2
        Log.i(TAG, "commit-2");
        // dev_commit-3
        Log.i(TAG, "commit-3");
    }
}