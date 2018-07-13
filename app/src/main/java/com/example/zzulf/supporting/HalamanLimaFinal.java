package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HalamanLimaFinal extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2;
    TextView text_pertanyaan,btn_back;
    public int i=0;
    public int yes=0;


    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_lima_final);

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

        text_pertanyaan.setText("Apakah ada peristiwa traumatis ? (kecelakaan/bencana/kekerasan/dll");
        btn_opt_1.setText("Yes");
        btn_opt_2.setText("No");

        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_pertanyaan.setText("Berapa lama rasa cemas tersebut muncul ?");
                btn_opt_1.setText("Lebih dari 1 bulan");
                btn_opt_2.setText(("Kurang dari satu bulan"));
                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(HalamanLimaFinal.this, Output.class);
                        intent.putExtra("output","Gangguan Post Traumatic Stress Disorder");
                        // Hasilnya = Post Traumatic Stress Disorder
                        startActivity(intent);
                    }
                });
                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(HalamanLimaFinal.this, Output.class);
                        intent.putExtra("output","Gangguan Acute Stress Disorder");
                        // Hasilnya = Acute Stress Disorder
                        startActivity(intent);
                    }
                });
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_pertanyaan.setText("Apakah cemas terjadi karena suatu reaksi dari stressor tertentu ?");
                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(HalamanLimaFinal.this,Output.class);
                        intent.putExtra("output","Gangguan Penyesuaian dengan cemas");
                        // Hasilnya = Gangguan Penyesuaian dengan cemas
                        startActivity(intent);
                    }
                });
                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(HalamanLimaFinal.this,Output.class);
                        intent.putExtra("output","Tidak bisa dijelaskan, silahkan konsultasikan langsung pada ahlinya");
                        // Hasilnya = Unknown
                        startActivity(intent);
                    }
                });
            }
        });

    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        HalamanLimaFinal.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

}
