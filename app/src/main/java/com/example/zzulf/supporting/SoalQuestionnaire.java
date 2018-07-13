package com.example.zzulf.supporting;

/**
 * Created by zzulf on 3/19/2018.
 */


public class SoalQuestionnaire {

    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Keluhan utama apa yang ibu/bapak/sdr alami ?",
            "Q2",
            "Bhinneka Tunggal Ika mempunyai arti ?",
            "Ibukota negara Indonesia saat ini adalah ?",
            "Siapa yang menjajah Indonesia selama 350 tahun ?",
            "Saat masa penjajahan, senjata yang biasa digunakan oleh pahlawan Indonesia adalah ?",
            "Monumen untuk mengenang perlawanan dan perjuanagan rakyat Indonesia untuk merebut kemerdekaan dari pemerintahan kolonial Hindia Belanda adalah ?",
            "Teks yang dibacakan Ir. Soekarno yang menyatakan Indonesia merdeka dalah teks ?",
            "Pulau terbesar di Indonesia adalah ?",
    };

    public String PertanyaanPerubahanMood[] = {
            "Apakah anda mengalami perasaan paling benar, hebat, peningkatan mood. ",
            "Tidur berkurang. ",
            "Lebih cerewet dari biasanya. ",
            "Seperti ada ide yang saling bertentangan saat ia berbicara. ",
            "Konsentrasi menurun / Sering lupa. ",
            "Peningkatan keterlibatan dalam kegiatan sosial, kerja, sekolah. ",
            "Peningkatan aktivitas fisik untuk tujuan tertentu. ",
            "Keinginan untuk terlibat dalam hal-hal yang beresiko tinggi. ",
            "Menjadi lebih mudah tersinggung. ",

    };

    public String PertanyaanHalamanLimaCabang[] = {
            "Apakah konsentrasi anda menurun ? ",
            "Apakah anda merasa kelelahan ? ",
            "Apakah anda merasa mudah tersinggung ? ",
            "Apakah anda kurang istirahat ? ",
            "Apakah anda mengalami gangguan tidur ? ",
            "Apakah badan anda terasa kencang ? ",
    };

    public String PertanyaanHalamanLimaCabang2[] = {
            "Apakah saat anda panik anda menjadi berkeringat ? ",
            "Apakah saat anda panik anda menjadi gemetar ? ",
            "Apakah saat anda panik anda menjadi mual ? ",
            "Apakah saat anda panik anda menjadi pusing ? ",
            "Apakah saat anda panik jantung anda menjadi berdebar ? ",
            "Apakah saat anda panik nafas anda memendek ? ? ",
            "Apakah saat anda panik anda merasakan sensasi tersengat ? ",
            "Apakah saat anda panik anda menjadi kedinginan ? ",
            "Apakah saat anda panik anda merasa tercekik ? ",
            "Apakah saat anda panik anda merasakan nyeri pada dada ? ",
            "Apakah saat anda panik kesadaran anda menurun ? ",
            "Apakah saat anda panik anda menjadi takut pingsan ? ",

    };

    public String SyaratHalamanEmpat[] = {
            "Perasaan murung berkepanjangan. ",
            "Kehilangan ketertarikan terhadap hal-hal yang selama ini diminati ",
    };

    public String HalamanEmpat[] = {
            "Sulit tidur / sering terbangun. ",
            "Perasaan murung memberat pada pagi hari. ",
            "Peningkatan / Penurunan nafsu makan serta berat badan yang signifikan. ",
            "Mudah lelah atau merasa lelah sepanjang hari. ",
            "Malas untuk beraktivitas sepanjang hari. ",
            "Sulit untuk berkonsentrasi atau mengambil keputusan yang terjadi setiap hari. ",
            "Merasa tidak berharga / bersalah. ",
            "Gangguan pencernaan / nyeri yang tidak membaik dengan obat. ",
            "Sering berfikir mengenai kematian. ",
            "Gejala-gejala diatas berlangsung minimal 2 minggu. ",
            "Gejala-gejala diatas berlangsung minimal 2 minggu. ",
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
            {"Yes","No","I Don't Know"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "Ir. Soekarno",
            "Pancasila",
            "Berbeda-beda tetapi tetap satu",
            "Jakarta",
            "Belanda",
            "Bambu runcing",
            "Monas",
            "Proklamasi",
            "Kalimantan",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

    public String getPertanyaanPerubahanMood(int x) {
        String soalPerubahanMood = PertanyaanPerubahanMood[x];
        return soalPerubahanMood;

    }

    public String getHalamanEmpat(int x) {
        String  soalHalamanEmpat = HalamanEmpat[x];
        return  soalHalamanEmpat;
    }

    public String getSyaratHalamanEmpat(int x) {
        String soalSyaratHalamanEmpat = SyaratHalamanEmpat[x];
        return soalSyaratHalamanEmpat;
    }

    public String getPertanyaanHalamanLimaCabang(int x) {
        String pertanyaanHalamanLimaCabang = PertanyaanHalamanLimaCabang[x];
        return pertanyaanHalamanLimaCabang;
    }

    public String getPertanyaanHalamanLimaCabang2(int x) {
        String pertanyaanHalamanLimaCabang2 = PertanyaanHalamanLimaCabang2[x];
        return pertanyaanHalamanLimaCabang2;
    }
}
