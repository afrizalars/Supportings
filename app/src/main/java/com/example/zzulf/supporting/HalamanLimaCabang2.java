package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HalamanLimaCabang2 extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2;
    TextView text_pertanyaan,btn_back;
    public int i=0;
    public int temp_yes = 0;
    public int yes=0;


    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_lima_cabang2);

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

        pertanyaanHalamanLimaCabang2(0);
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=1;
                temp_yes+=1;
                pertanyaanHalamanLimaCabang2(i);
                if (temp_yes>2){
                    btn_opt_1.setText("Yes");
                    btn_opt_2.setText("No");
                    btn_opt_1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            text_pertanyaan.setText("Cemas entah di tempat ramai atau saat sendiri karena takut tidak dapat menyelamatkan diri saat terjadi sesuatu.");
                            btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(HalamanLimaCabang2.this,Output.class);
                                    intent.putExtra("output","Gangguan Panic Disorder");
                                    startActivity(intent);
                                }
                            });
                            btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(HalamanLimaCabang2.this,Output.class);
                                    intent.putExtra("output","Gangguan Panic Disorder + Agoraphobia");
                                    startActivity(intent);
                                }
                            });
                        }
                    });
                    btn_opt_2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(HalamanLimaCabang2.this,HalamanLimaFinal.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=1;
                pertanyaanHalamanLimaCabang2(i);
                if (i > 12){
                    Intent intent = new Intent(HalamanLimaCabang2.this, HalamanLimaFinal.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                }
            }
        });
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        HalamanLimaCabang2.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void pertanyaanHalamanLimaCabang2(int x){
        text_pertanyaan.setText(soalQuestionnaire.getPertanyaanHalamanLimaCabang2(x));
    }

}
