package Minggu12;

public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(nama + " " + nim + " " + kelas + " " + ipk);
    }
}
