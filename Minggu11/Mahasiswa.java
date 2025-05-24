package Minggu11;

public class Mahasiswa {
    String nama;
    String kelas;
    String nim;

    Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    void tampilInformasi() {
        System.out.println(nama + " " + nim + " " + kelas);
    }
}