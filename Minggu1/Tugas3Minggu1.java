package Minggu1;

import java.util.Scanner;

public class Tugas3Minggu1{
    static Scanner sc = new Scanner(System.in);
    // membuat array untuk menyimpan data
    static int jumlahMatkul = 0;
    static String namaMatkul[];
    static int sks[];
    static int semester[];
    static String hariKuliah[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah matkul: ");
        jumlahMatkul = sc.nextInt();
        namaMatkul = new String[jumlahMatkul];
        sks = new int[jumlahMatkul];
        semester = new int[jumlahMatkul];
        hariKuliah= new String [jumlahMatkul];

        sc.nextLine();

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Nama matkul: ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = sc.nextLine();
            System.out.println();
        }
        
        // menampilkan jadwal kuliah
        System.out.println();
        System.out.printf("%-20s %-15s\n", "Mata Kuliah", "Hari Kuliah");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-20s %-15s\n", namaMatkul[i], hariKuliah[i]);
        }

        cariHariMatkul();
        cariSemester(namaMatkul,hariKuliah, semester);
        cariMatkul();

        sc.close();

    }


    static void cariHariMatkul() {
        // menampilkan matakuliah hanya di hari tertentu
        do {
            System.out.println("Cari jadwal kuliah sesuai hari (y/n)");
            String y = sc.nextLine();
            if (y.equalsIgnoreCase("y")) {
                System.out.print("Masukkan hari: ");
                String hari = sc.nextLine();
                System.out.println();
                System.out.printf(
                    "%-20s %-15s\n",
                        "Mata Kuliah", "Hari Kuliah"
                );
                boolean ditemukan = false;
                for (int i = 0; i < jumlahMatkul; i++) {
                    if (hari.equalsIgnoreCase(hariKuliah[i])) {
                        System.out.printf(
                            "%-20s %-15s\n",
                             namaMatkul[i], hariKuliah[i]
                        );
                        ditemukan = true;
                    }
                }
                if (!ditemukan){
                    System.out.println("tidak ada jadwal kuliah");
                }
            } else {
                break;
            }
        } while (true);

    }


    static void cariSemester(String namaMatkul[], String hari[], int semester[] ) {
        // menampilkan matakuliah hanya di hari tertentu
        do {
            System.out.println("Cari daftar kuliah sesuai semester (y/n)");
            String y = sc.nextLine();
            if (y.equalsIgnoreCase("y")) {
                System.out.print("Cari jadwal kuliah sesuai semester: ");
                int _semester = sc.nextInt();
                System.out.println();
                System.out.printf(
                    "%-20s %-15s\n",
                        "Mata Kuliah", "Hari Kuliah"
                );
                boolean ditemukan = false;
                for (int i = 0; i < jumlahMatkul; i++) {
                    if (_semester == semester[i]) {
                        System.out.printf(
                            "%-20s %-15s\n",
                                namaMatkul[i], hariKuliah[i]
                        );
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Tidak ada kuliah pada semester tersebut.");
                }
            } else {
                break;
            }
        } while (true);
    }


    public static void cariMatkul() {
        // menampilkan matakuliah sesuai input
        do {
            System.out.println("Cari daftar kuliah sesuai nama matkul (y/n)");
            String y = sc.nextLine();
            if (y.equalsIgnoreCase("y")) {
                System.out.print("Cari jadwal kuliah sesuai matkul: ");
                String matkul = sc.nextLine();
                System.out.println();
                System.out.printf(
                    "%-20s %-15s\n",
                        "Mata Kuliah", "Hari Kuliah"
                );
                boolean ditemukan = false;
                for (int i = 0; i < jumlahMatkul; i++) {
                    if (matkul.equalsIgnoreCase(hariKuliah[i])) {
                        System.out.printf(
                            "%-20s %-15s\n",
                                namaMatkul[i], hariKuliah[i]
                        );
                        ditemukan = true;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Tidak ada kuliah dengan nama mata kuliah tersebut.");
                }
            } else {
                break;
            }
        } while (true);
    }
}