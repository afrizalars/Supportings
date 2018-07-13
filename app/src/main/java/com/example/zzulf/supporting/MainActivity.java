package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    // variable
    Button btn_signin,btn_signup;
    Animation left2right,right2left;
    LinearLayout linear1,linear2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //find view by id
        btn_signin = (Button) findViewById(R.id.btn_signin);
        btn_signup = (Button) findViewById(R.id.btn_signup);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);

        //Motion ID
        left2right = AnimationUtils.loadAnimation(this,R.anim.left2right);
        right2left = AnimationUtils.loadAnimation(this,R.anim.right2left);

        //Motion Action
        linear1.setAnimation(left2right);
        linear2.setAnimation(right2left);

        //button on click listener

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_signup = new Intent(MainActivity.this, signup_manual.class);
                i_signup.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i_signup);
            }
        });


    }
}
