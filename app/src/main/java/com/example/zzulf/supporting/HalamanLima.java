package com.example.zzulf.supporting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HalamanLima extends AppCompatActivity {

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

        text_pertanyaan.setText("Apakah mengkonsumsi obat tertentu/alkohol/ memiliki penyakit (trauma kepala, epilepsi, demensia,dsb ?)");
        btn_opt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HalamanLima.this,Output.class);
                intent.putExtra("output","Gangguan kecemasan karena zat atau sakit");
                //Hasilnya = Gangguan kecemasan karena zat atau sakit
                startActivity(intent);
            }
        });
        btn_opt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_pertanyaan.setText("Perasaan panik berulang dan muncul tidak terduga dalam satu bulan terakhir.");
                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(HalamanLima.this,HalamanLimaCabang2.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                    }
                });
                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        text_pertanyaan.setText("Cemas entah ditempat ramai atau sendiri karena taku tak dapat menyelamatkan diri saat terjadi sesuatu.Telah terjadi sekitar 6 bulan.");
                        btn_opt_1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(HalamanLima.this, Output.class);
                                intent.putExtra("output","Gangguan Agoraphobia");
                                // hasil = Agoraphobia
                                startActivity(intent);
                            }
                        });

                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                text_pertanyaan.setText("Cemas saat berpisah dari orang yang dekat dengan pasien saat pasien masih kanak-kanak.");
                                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(HalamanLima.this, Output.class);
                                        intent.putExtra("output","Gangguan Separation Anxiety Disorder");
                                        //Hasil = Separation Anxiety Disorder
                                        startActivity(intent);
                                    }
                                });
                                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        text_pertanyaan.setText("Ketakutan berlebihan dihina atau dipermalukan didepan orang.");
                                        btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent(HalamanLima.this,Output.class);
                                                intent.putExtra("output","Gangguan Cemas Sosial");
                                                //Hasilnya = Gangguan Cemas Sosial
                                                startActivity(intent);
                                            }
                                        });
                                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                text_pertanyaan.setText("Takut berlebihan akan objek atau situasi.");
                                                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(HalamanLima.this,Output.class);
                                                        intent.putExtra("output","Gangguan Fobia Spesifik");
                                                        //Hasilnya = Fobia Spesifik
                                                        startActivity(intent);
                                                    }
                                                });
                                                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        text_pertanyaan.setText("Keinginan sangat kuat untuk harus melakukan hal yang sama berulang-ulang.");
                                                        btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                //todo teruskeun
                                                                text_pertanyaan.setText("Total waktu kejadian lebih dari 1 jam per hari");
                                                                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        text_pertanyaan.setText("Dilakukan untuk menghilangkan cemas.");
                                                                        btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                Intent intent = new Intent(HalamanLima.this,Output.class);
                                                                                intent.putExtra("output","Gangguan Obsessive Compulsive Disorder");
                                                                                //hasil = Obsessive Compulsive Dissorder
                                                                                startActivity(intent);
                                                                            }
                                                                        });
                                                                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                Intent intent = new Intent(HalamanLima.this,Output.class);
                                                                                intent.putExtra("output","Gangguan Obsessive Compulsive Disorder");
                                                                                //hasil = Obsessive Compulsive Dissorder
                                                                                startActivity(intent);
                                                                            }
                                                                        });
                                                                    }
                                                                });

                                                                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        text_pertanyaan.setText("Dilakukan untuk menghilangkan cemas.");
                                                                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                Intent intent = new Intent(HalamanLima.this,Output.class);
                                                                                intent.putExtra("output","Gangguan Obsessive Compulsive Disorder");

                                                                                //hasil = Obsessive Compulsive Dissorder
                                                                                startActivity(intent);
                                                                            }
                                                                        });
                                                                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View view) {
                                                                                Intent intent = new Intent(HalamanLima.this,Output.class);
                                                                                intent.putExtra("output","Gangguan Obsessive Compulsive Disorder");
                                                                                //hasil = Obsessive Compulsive Dissorder
                                                                                startActivity(intent);
                                                                            }
                                                                        });
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View view) {
                                                                text_pertanyaan.setText("Hari-hari dengan cemas berlebih muncul lebih sering daripada hari-hari tanpa cemas");
                                                                btn_opt_1.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        Intent intent = new Intent(HalamanLima.this,HalamanLimaCabang.class );
                                                                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                                                        startActivity(intent);

                                                                    }
                                                                });
                                                                btn_opt_2.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View view) {
                                                                        Intent intent = new Intent(HalamanLima.this,HalamanLimaCabang.class );
                                                                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                                                                        startActivity(intent);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        super.onBackPressed();
        HalamanLima.this.overridePendingTransition(R.transition.fade_in,
                R.transition.fade_out);
    }


}
