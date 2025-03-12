package Minggu5.BruteForceDivideAndConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.Keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan bf: " + sm.totalBf());
        System.out.println("Total keuntungan menggunakan dc: " + 
        sm.totalDc(sm.Keuntungan, 0, (elemen-1)));

        input.close();
    }
}
