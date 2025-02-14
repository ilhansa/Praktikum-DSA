package Minggu1;

import java.util.Scanner;

public class PraktikumArray {
    static int jumlahMatkul = 9;
    static double nilaiMatkul[] = new double [jumlahMatkul];
    static String matkul[] =  {
        "Konsep Teknologi Informasi",
        "Critical Thinking dan Problem Solving",
        "Matematika Dasar", "Bahasa Inggris",
        "Pengantar Akuntansi, Manajemen, dan Bisnis",
        "Bahasa Indonesia", "Dasar Pemrograman",
         "Praktikum Dasar Pemrograman", "Agama"
    };
    static double bobotNilai[] = new double[jumlahMatkul];
    static double nilaiHuruf[] = new double[jumlahMatkul];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hasilJumlah = 0;
        // input nilai
        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.print("Masukkan nilai " + matkul[i] + ": ");
            nilaiMatkul[i] = sc.nextDouble();

            // Cek apakah nilai yg diinput diatas 100
            if(nilaiMatkul[i] > 100) {
                System.out.println("Nilai tidak valid");
                System.exit(1);
            }

            // hitung rata rata bobot nilai
            hasilJumlah += nilaiMatkul[i];
        }
        double rataNilai = (hasilJumlah/ 9);
        sc.close();

        // print (hitung nilai huruf & bobot nilai) 
        System.out.println("Hasil konversi nilai");
        System.out.print(String.format("%-45s%-18s%-15s%-15s\n",
        "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai"));

        for (int i = 0; i < nilaiMatkul.length; i++) {
            System.out.printf("%-45s %-18.2f %-15s %-15.2f%n", 
                matkul[i], nilaiMatkul[i], 
                hitungNilaiHuruf(nilaiMatkul[i]), 
                hitungNilaiBobot(nilaiMatkul[i])
            );
        }
        System.out.println();
        System.out.printf("Rata-rata nilai: %.2f\n", rataNilai);
    }

    static String hitungNilaiHuruf(double _nilai) {
        double nilaiAkhir = _nilai;
        String nilaiHuruf;
        if (80 < nilaiAkhir && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } 
        else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } 
        else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        }
        else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } 
        else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        }
        else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }

    static double hitungNilaiBobot(double _nilai) {
        double nilaiAkhir = _nilai;
        double bobotNilai;
        if (80 < nilaiAkhir && nilaiAkhir <= 100) {
            bobotNilai = 4;
        } 
        else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
            bobotNilai = 3.5;
        } 
        else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
            bobotNilai = 3;
        }
        else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
            bobotNilai = 2.5;
        } 
        else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
            bobotNilai = 2;
        }
        else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
            bobotNilai = 1;
        } else {
            bobotNilai = 0;
        }
        return bobotNilai;
    }
}
