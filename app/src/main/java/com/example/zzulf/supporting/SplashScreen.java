package com.example.zzulf.supporting;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView) findViewById(R.id.logo);

        Animation splashin = AnimationUtils.loadAnimation(this,R.anim.fadeout_fadein);
        Animation splashOut = AnimationUtils.loadAnimation(this, R.anim.fadein_fadeout);
        logo.startAnimation(splashOut);
        logo.startAnimation(splashin);
        logo.startAnimation(splashOut);


        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    finish();
                }
            }
        };
        timer.start();
    }
}
