package com.example.zzulf.supporting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class signup extends AppCompatActivity {
   public LinearLayout  linear1, linear2;
    Animation left2right,right2left;
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();
        signup.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Motion ID
        left2right = AnimationUtils.loadAnimation(this,R.anim.left2right);
        right2left = AnimationUtils.loadAnimation(this,R.anim.right2left);

        //Motion Action
        linear1.setAnimation(left2right);
        linear2.setAnimation(right2left);
        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


    }
}
