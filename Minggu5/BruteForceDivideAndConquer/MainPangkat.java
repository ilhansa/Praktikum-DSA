package Minggu5.BruteForceDivideAndConquer;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis pada elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat pada elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("Hasil pangkat brute force: ");
        // for (Pangkat p : png) {
        //     System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBf(p.nilai, p.pangkat));
        // }
        for (int i = 0; i < png.length; i++) {
            System.out.println(png[i].nilai + "^" + png[i].pangkat + ": " + png[i].pangkatBf());
        }

        System.out.println("Hasil pangkat divide and conquer: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDc(p.nilai, p.pangkat));
        }

        input.close();
    }
}
