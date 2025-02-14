package Minggu1;

import java.util.Scanner;

public class Tugas1Minggu1 {
    // Char
    static char kode[] = {
        'A', 'B', 'D', 'E', 'F',
        'G', 'H', 'L', 'N', 'T' 
    };

    static char[][] kota = {
        {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ', ' ', ' '},
        {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
        {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}  
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode: ");
        char input = sc.next().charAt(0);
        input = Character.toUpperCase(input);

        for (int i = 0; i < kode.length; i++) {
            if (input == kode[i]) {
                System.out.print(kota[i]);
            }
        }
        sc.close();
    }
}
