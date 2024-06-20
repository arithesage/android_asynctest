package me.arithesage.java.android.apps.asynctasktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import me.arithesage.java.android.libs.helpers.OSHelpers;
import me.arithesage.java.android.libs.helpers.OSHelpers.AndroidAsyncTask;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OSHelpers.RunAsync (new AndroidAsyncTask(() ->
        {
            String greeting = "Hello from async task.";
            Log.d ("DUMMY", greeting);
        }));
    }
}
