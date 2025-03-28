package Minggu7;

public class Dosen7 {
    String kode;
    String nama;
    boolean jenisKelamin; // true pria, false wanita
    int usia;

    Dosen7() {}

    Dosen7(String kd,String nm, int us) {
        kode = kd;
        nama = nm;
        usia = us;
    }

    Dosen7 (String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + (jenisKelamin ? "Pria" : "Wanita" ));
        System.out.println("Usia : " + usia);
    }
}

