package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class layout_quiz extends AppCompatActivity {

    //membuat variabel baru sesuai tipe
    Button btn_opt_1, btn_opt_2, btn_opt_3;
    TextView text_pertanyaan,btn_back;

    //membuat objek dari kelas SoalPilihanGanda.java
    private SoalQuestionnaire soalQuestionnaire = new SoalQuestionnaire();
    private int soalQuestionnaireLenght = soalQuestionnaire.pertanyaan.length;
    Random r;
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
        btn_opt_3 = (Button) findViewById(R.id.btn_opt3);

        updateQuestion(3);

        //menentukan aksi ketika button option 1/2/3/4 diklik
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            updateQuestion(4);
            }
        });

        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            updateQuestion(5);
            }
        });

        btn_opt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            updateQuestion(6);
            }
        });

    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        layout_quiz.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }

    private void updateQuestion(int num){
        text_pertanyaan.setText(soalQuestionnaire.getPertanyaan(num));
        btn_opt_1.setText(soalQuestionnaire.getPilihanJawaban1(0));
        btn_opt_2.setText(soalQuestionnaire.getPilihanJawaban2(0));
        btn_opt_3.setText(soalQuestionnaire.getPilihanJawaban3(0));
    }

}
