package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HalEmpatTidakTerpenuhi extends AppCompatActivity {
    Button btnOption1, btnOption2, btnOption3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_empat_tidak_terpenuhi);

        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //Find View By Id
        btnOption1 = findViewById(R.id.btn_opt1);
        btnOption2 = findViewById(R.id.btn_opt2);
        btnOption3 = findViewById(R.id.btn_opt3);

        //Set On Click Listener Button
        btnOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalEmpatTidakTerpenuhi.this,Output.class);
                intent.putExtra("output","Gangguan Episode Manic / Hypomanic");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                //hasil = Episode Manic / Hypomanic
            }
        });

        btnOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalEmpatTidakTerpenuhi.this,Output.class);
                intent.putExtra("output","Gangguan Episode Manic / Hypomanic");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                //hasil = Episode Manic / Hypomanic
            }
        });

        btnOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalEmpatTidakTerpenuhi.this,Output.class);
                intent.putExtra("output","Gangguan Cyplotimic");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                //hasil = Gangguan Cyplotimic
            }
        });
    }
}
