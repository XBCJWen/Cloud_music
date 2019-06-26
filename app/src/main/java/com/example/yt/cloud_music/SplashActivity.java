package com.example.yt.cloud_music;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 3000);

//        Timer timer=new Timer(); // 定时器
//        TimerTask task=new TimerTask() {
//            @Override
//            public void run() {
//                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
//            startActivity(intent);
//            finish();
//            }
//        };
//        timer.schedule(task,3000);
//    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e ){
//            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
//            startActivity(intent);
//            finish();
//        }
//    }
    }
}
