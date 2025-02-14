package Minggu1;

import java.util.Scanner;

public class Tugas2Minggu1 {
    // hitung kubus
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextInt();
        System.out.println("Pilih menu: ");
        System.out.println("1. hitung volume");
        System.out.println("2. hitung luas permukaan");
        System.out.println("3. hitung keliling");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.print(hitungVolumeKubus(sisi));
        } 
        else if (menu == 2) {
            System.out.println(hitungLuasPermukaanKubus(sisi)); 
        } 
        else if (menu == 3) {
            System.out.println(hitungKelilingKubus(sisi));
        } else {
            System.out.println("Menu tidak valid");
        }
        sc.close();
    }   

    static double hitungVolumeKubus(double _sisi) {
        double sisi = _sisi;
        return sisi * sisi * sisi;
    }

    static double hitungLuasPermukaanKubus(double _sisi) {
        double sisi = _sisi;
        return 6 * (sisi * sisi);
    }

    static double hitungKelilingKubus(double _sisi) {
        double sisi = _sisi;
        return (12 * sisi);
    }
}
