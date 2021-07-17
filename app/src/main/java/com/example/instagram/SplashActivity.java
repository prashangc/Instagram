package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//
//        getSupportActionBar().hide();
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                finally {
                    Intent intent = new Intent(SplashActivity.this , Login.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}