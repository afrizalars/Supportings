package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Output extends AppCompatActivity {
    TextView textHasil;
    Button btn_opt_1, btn_opt_2;
    String Hasil = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        textHasil = findViewById(R.id.text_hasil);
        btn_opt_1 = findViewById(R.id.btn_opt1);
        btn_opt_2 = findViewById(R.id.btn_opt2);

        Hasil = getIntent().getStringExtra("output");
        textHasil.setText(Hasil);

        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Output.this, MeetExperts.class);
                startActivity(i);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Output.this, Home.class);
                startActivity(i);
                i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            }
        });

    }

    public void onBackPressed(){
        super.onBackPressed();
        Output.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }
}
