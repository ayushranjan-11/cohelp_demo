package com.example.cohelp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        startActivity(new Intent(this, MapsActivity.class));

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,
                        MapsActivity.class);
                //Intent is used to switch from one activity to another.

                MainActivity.this.startActivity(i);
                //invoke the MapsActivity.

                MainActivity.this.finish();
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);

         */
    }


}