package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HalamanEmpat extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2;
    TextView text_pertanyaan,btn_back;
    public int i=0;
    public int temp_yes=0;
    int tempHal3Terpenuhi ;


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

        pertanyaanHalamanEmpat(0);
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i +=1;
                pertanyaanHalamanEmpat(i);
                temp_yes +=1;
                if (temp_yes >= 3 ){
                    text_pertanyaan.setText("Apakah pasien mengalami halusinasi / penurunan respon (tidak mau makan,berbicara,bergerak) ?");
                    btn_opt_1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            text_pertanyaan.setText("Apakah ada waktu sekitar 2 minggu terjadi halusinasi tanpa disertai perubahan mood yang menonjol ?");
                            btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(HalamanEmpat.this,Output.class);
                                    intent.putExtra("output","Gangguan Skizroafektif");
                                    //Hasilnya = Gangguan Skizroafektif
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                    startActivity(intent);
                                }
                            });
                            btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    Intent intent = new Intent(HalamanEmpat.this,Output.class);
                                    intent.putExtra("output","Gangguan Bipolar");
                                    //Hasilnya = Bipolar
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                    startActivity(intent);
                                }
                            });
                        }
                    });

                    btn_opt_2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(HalamanEmpat.this,Output.class);
                            intent.putExtra("output","Gangguan Bipolar");
                            //Hasilnya = Bipolar
                            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            startActivity(intent);
                        }
                    });
                }
                else if (i > 8){
                    Intent intent = new Intent(HalamanEmpat.this, HalamanEmpatTidakTerpenuhi.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                } else {
                    i+=1;
                }
                i+=1;
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i += 1;
                pertanyaanHalamanEmpat(i);
            }
        });

    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        HalamanEmpat.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void pertanyaanHalamanEmpat(int x){
        text_pertanyaan.setText(soalQuestionnaire.getHalamanEmpat(x));
    }

}
