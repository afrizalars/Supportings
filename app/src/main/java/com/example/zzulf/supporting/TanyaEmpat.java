package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class TanyaEmpat extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2, btn_opt_3;
    TextView text_pertanyaan,btn_back;
    public int i=0;
    public int no=0;


    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_quiz);


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

        text_pertanyaan.setText("Apakah pasien sering mengalami depresi selama 2 tahun (1 tahun untuk anak dan remaja) terakhir ?");
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TanyaEmpat.this, Output.class);
                intent.putExtra("output","Gangguan Distimik");
                //Hasil Gangguan Distimik
                startActivity(intent);
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_pertanyaan.setText("Apakah pasien sering mengalami depresi bila terdapat stressor ?");
                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(TanyaEmpat.this, Output.class);
                        intent.putExtra("output","Gangguan Penyesuaian dengan Afek Depresif");
                        // Hasil gangguan penyesuaian dengan afek depresi
                        startActivity(intent);
                    }
                });
                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(TanyaEmpat.this, Output.class);
                        intent.putExtra("output","Tidak bisa dijelaskan, silahkan konsultasikan langsung pada ahlinya");
                        //Hasil Konsultasikan dengan dokter
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
        TanyaEmpat.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void soalSsyaratHalamanEmpat(int x){
        text_pertanyaan.setText(soalQuestionnaire.getSyaratHalamanEmpat(x));
    }

}
