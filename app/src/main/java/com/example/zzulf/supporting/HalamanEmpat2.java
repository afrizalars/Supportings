package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HalamanEmpat2 extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2, btn_opt_3;
    TextView text_pertanyaan,btn_back,status;
    public int kelamins = 0;
    public int i=0;
    public int yes=0;

    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_quiz);

        //Variable


        //Immersive Full Screen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        //r = new Random();

        //menyambungkan antara variabel KuisPilihanGanda.java dengan id activity_kuis_pilihan_ganda
        text_pertanyaan = (TextView) findViewById(R.id.text_pertanyaan);
        btn_opt_1 = (Button) findViewById(R.id.btn_opt1);
        btn_opt_2 = (Button) findViewById(R.id.btn_opt2);
        status = findViewById(R.id.status);

        kelamins = getIntent().getIntExtra("gender",0);
        //btn_opt_1.setText(kelamins);

        if (kelamins == 1){
            text_pertanyaan.setText("Apakah habis melahirkan dalam 6 bulan terakhir ?");
            btn_opt_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(HalamanEmpat2.this, Output.class);
                intent.putExtra("output","Gangguan Pospartum Mood Disorder");
                startActivity(intent);
                }
        });
            btn_opt_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intent = new Intent(HalamanEmpat2.this, Output.class);
                intent.putExtra("output","Gangguan Depresi Mayor");
                startActivity(intent);
                }
        });

        } else if (kelamins == 0){
            Intent intent = new Intent(HalamanEmpat2.this, Output.class);
            intent.putExtra("output","Gangguan Depresi Mayor");
            startActivity(intent);
        }

    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        HalamanEmpat2.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void pertanyaanHalamanEmpat(int x){
        text_pertanyaan.setText(soalQuestionnaire.getHalamanEmpat(x));
    }

}
