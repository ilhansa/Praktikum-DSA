package Minggu1;
import java.util.Scanner;

public class Teori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah mahasiswa & matkul
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah matkul: ");
        int jumlahMatkul = sc.nextInt();
        System.out.println();

        int [][] mahasiswa = new int [jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.print(
                    "Masukkan nilai mahasiswa ke " + (i + 1) 
                    + " matkul ke " + (j+1) + ": "
                );
                mahasiswa[i][j] = sc.nextInt();  
            }
            System.out.println();
        }

        hitungNilaiRataMahasiswa(mahasiswa);
        sc.close();
    }

    public static void hitungNilaiRataMahasiswa(int mahasiswa[][]) {
        // nilai kkm
        int batasNilai = 75;

        // menghitung nilai rata" setiap mahasiswa
        System.out.println("Nilai Mahasiswa");
        for (int i = 0; i < mahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < mahasiswa[i].length; j++) {
                totalNilai += mahasiswa[i][j];
            }
            double rataRata =  totalNilai/mahasiswa[i].length;
            System.out.println("Mahasiswa " + (i+1) + ": " + rataRata);

            // cek nilai mahasiswa
            if(rataRata >= batasNilai) {
                System.out.println("-LULUS");
            } else {
                System.out.println("-TIDAK LULUS");
            }
            System.out.println(" ");
        }
    } 
}

// Pseudocode
/*
    fungsi main() {
        Scanner sc = new Scanner(System.in);

        // input jumlah mahasiswa & matkul
        print "Masukkan jumlah mahasiswa"
        input jumlah mahasiswa
        print "Masukkan jumlah matkul"
        input jumlah matkul

        array mahasiswa[jumlah mahasiswa][jumlah matkul]

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                print "Masukkan nilai mahasiswa ke " + (i + 1) + " matkul ke " + (j+1)
                input nilai ke array
            }
        }
        // Menggunakan fungsi untuk menghitung rata rata nilai & menentukan lulus atau tidak
        hitungNilaiRataMahasiswa(mahasiswa)
    }

    fungsi hitungNilaiRataMahasiswa(int mahasiswa[][]) {
        // nilai kkm 75
        int batasNilai 75

        // menghitung nilai rata" setiap mahasiswa
        for (int i = 0; i < mahasiswa.length; i++) {
            // setiap perulangan (pergantian mahasiswa) total nilai kembali ke 0
            int totalNilai = 0
            for (int j = 0; j < mahasiswa[i].length; j++) {
                totalNilai += mahasiswa[i][j]
            }
            menghitung rata rata nilai setiap mahasiswa
            print "Nilai mahasiswa"

            // cek nilai mahasiswa
            if(rataRata >= batasNilai) {
                lulus
            } else {
                tidak lulus
            }
        }
    } 
}
 */