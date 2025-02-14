package Minggu1;

import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai uts: ");
        int nilaiUts = sc.nextInt();
        System.out.print("Masukkan nilai uas: ");
        int nilaiUas = sc.nextInt();

        // Cek apakah nilai yg diinput diatas 100
        if(nilaiTugas > 100 || nilaiKuis > 100 ||
             nilaiUts > 100 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid");
            System.exit(1);
        }
        sc.close();

        // menghitung nilai & status lulus
        double nilaiAkhir = hitungBobotNilai(
            nilaiTugas, nilaiKuis, nilaiUts, nilaiUas
        );
        String nilaiHuruf = hitungNilaiHuruf(nilaiAkhir);
        String status = cekLulus(nilaiHuruf);

        // Print hasil akhir
        System.out.println("Nilai Akhir :" + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println(status);
    }

    static double hitungBobotNilai(
        int _nilaiTugas,
        int _nilaiKuis, 
        int _nilaiUts, 
        int _nilaiUas
        ) {
            
        // bobot nilai
        double bobotNilaitugas = 0.1; // 10%
        double bobotNilaiKuis = 0.2; // 20%
        double bobotNilaiUts = 0.3; // 30%
        double bobotNilaiUas = 0.4; // 40%

        // hitung nilai berdasarkan bobotnya
        double nilaiTugas = _nilaiTugas * bobotNilaitugas;
        double nilaiKuis = _nilaiKuis * bobotNilaiKuis;
        double nilaiUts = _nilaiUts * bobotNilaiUts;
        double nilaiUas = _nilaiUas * bobotNilaiUas;

        // nilai setelah pembobotan
        double nilaiAkhir = (nilaiTugas + nilaiKuis + nilaiUts + nilaiUas);
        return nilaiAkhir;
    }

    static String hitungNilaiHuruf(double _nilaiAkhir) {
        double nilaiAkhir = _nilaiAkhir;
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

    static String cekLulus(String _nilaiHuruf) {
        String nilaiHuruf = _nilaiHuruf;
        String status;
        if (nilaiHuruf.equalsIgnoreCase("D")
             || nilaiHuruf.equalsIgnoreCase("E")
            ) 
        {
            status = "TIDAK LULUS";
        } else {
            status = "LULUS";
        }
        return status;
    }
}   
