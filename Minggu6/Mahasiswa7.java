package Minggu6;

import java.util.Scanner;

public class Mahasiswa7 {
    Scanner input = new Scanner(System.in);
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    Mahasiswa7() {}

    Mahasiswa7(String Nim, String Nama, String Kelas, double Ipk) {
        nim = Nim;
        nama = Nama;
        kelas = Kelas;
        ipk = Ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Ipk: " + ipk);
    }
}
