package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class pil_perubahan_mood extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2, btn_opt_3;
    TextView text_pertanyaan,btn_back;
    public int i = 0;
    public int temp= 0;
    public  int tempNo= 0;
    public int tempHal4 = 0;
    public  int tempSyaratHalEmpat = 0;


    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    private int soalQuestionnaireLenght = soalQuestionnaire.pertanyaan.length;
    Random r;
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

        updateQuestion(0);

        //menentukan aksi ketika button option 1/2/3/4 diklik
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i+=1;
                temp +=1;
                updateQuestion(i);
                if(temp > 2){
                    //to-do-terpenuhi
                    Intent i = new Intent(pil_perubahan_mood.this, syaratHalamanEmpat.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(i);
                }
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i +=1;
                updateQuestion(i);
                if(i > 7){
                    //to-do-tidak-terpenuhi
                    Intent intent = new Intent(pil_perubahan_mood.this,syaratHalamanEmpat2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);

                }
            }
        });



    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        pil_perubahan_mood.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void updateQuestion(int num){
        text_pertanyaan.setText(soalQuestionnaire.getPertanyaanPerubahanMood(num));
    }

    private void pertanyaanEmpat(int x){
        text_pertanyaan.setText(soalQuestionnaire.getHalamanEmpat(x));
    }

    private void soalSsyaratHalamanEmpat(int x){
        text_pertanyaan.setText(soalQuestionnaire.getSyaratHalamanEmpat(x));
    }

}
