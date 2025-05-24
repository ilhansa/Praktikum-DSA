package Minggu11;

public class Mahasiswa7 {
    String nama;
    String kelas;
    String nim;
    double ipk;

    Mahasiswa7(String nama, String kelas, String nim, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
        this.kelas = kelas;
        this.nim = nim;
    }

    void tampilInformasi() {
        System.out.println(nama + " " + nim + " " + kelas + " " + ipk);
    }
}
