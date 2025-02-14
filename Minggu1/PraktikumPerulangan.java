package Minggu1;

import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input nim
        System.out.println("Masukkan NIM: ");
        String _nim = sc.nextLine();
        sc.close();

        // array sebesar digit nim
        int nim[] = new int [_nim.length()];

        // mengubah string(char) ke int
        for (int i = 0; i < _nim.length(); i++) {
            nim[i] = _nim.charAt(i) - '0';

            // mengecek apakah angka ganjil
            if (nim[i] % 2 == 0){
                System.out.print(nim[i] + " ");
            } else {
                System.out.print("* ");
            }
        }
        // mencari nilai n
        int n = (nim[_nim.length()-1] += 10);
        System.out.println();
        System.out.printf("n: " + n);
    }
}
