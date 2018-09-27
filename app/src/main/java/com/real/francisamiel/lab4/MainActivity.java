package com.real.francisamiel.lab4;

import android.annotation.SuppressLint;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button toastButton;
    String myToast = "You pressed the back button";
    protected Button snackbarButton;
    View a;

    protected void onStart(){
        super.onStart();
        Log.d("logs", "App has started");
    }

    protected void onResume(){
        super.onResume();
        Log.d("logs", "App has Resumed");
    }

    protected void onPause(){
        super.onPause();
        Log.d("logs", "App has been Paused");
    }

    protected void onStop(){
        super.onStop();
        Log.d("logs", "App has stopped");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("logs", "App has restarted");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("logs", "App has been Destroyed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastButton = (Button)findViewById(R.id.button3);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),myToast,Toast.LENGTH_LONG).show();
            }
        });

        snackbarButton = (Button)findViewById(R.id.button4);
        a = findViewById(android.R.id.content);

        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(a, "You pressed the next button", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
