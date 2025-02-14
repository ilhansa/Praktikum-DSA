package Minggu1;

import java.util.Scanner;

public class PraktikumFungsi {
    // membuat array sesuai data
    static int cabang = 4; 
    static int jenisTanaman = 3;
    static int aglonema = 0;
    static int keladi = 1;
    static int alocasia = 2;
    static int mawar = 3;
    static int tokoBunga [][] = {
        {10,5,15,7}, // cabang 1
        {6,11,9,12}, // 2
        {2,10,10,5}, //3
        {5,7,12,9}
    };

    // membuat array daftar harga
    static int hargaAglonema = 75000; //75.000
    static int hargaKeladi = 50000; //50.000
    static int hargaAlocasia = 60000; //60.000
    static int hargaMawar = 10000; //10.000
    static int daftarHarga[] = {
        hargaAglonema, hargaKeladi,
        hargaAlocasia, hargaMawar
    };

    // membuat array daftar pendapatan setiap cabang
    static int [] pendapatan = new int[cabang];
    public static void main(String[] args) {
        // 1. menghitung pendapatan setiap cabang
        hitungPendapatan();
        for (int i = 0; i < cabang; i++) {
            System.out.println(
                "Pendapatan cabang " + (i +1) +
                ": " + pendapatan[i]
            );   
        }

        // 2. cek stock
        cekStock();

        // 3. mengurangi stock
        penguranganStock();

        // 4. cek stock setelah dikurangi
        cekStock();

        // 5. Hitung ulang pendapatan setelah pengurangan stock
        hitungPendapatan();
        for (int i = 0; i < cabang; i++) {
            System.out.println(
                "Pendapatan cabang " + (i + 1) +
                " setelah pengurangan: " + pendapatan[i]
            );
        }
    }

    public static void hitungPendapatan() {
        for (int i = 0; i < tokoBunga.length; i++){
            int pendapatanPerCabang = 0;
            for (int j = 0; j < tokoBunga[i].length; j++) {
                pendapatanPerCabang += tokoBunga[i][j] * daftarHarga[j];
            }
            pendapatan[i] = pendapatanPerCabang;
        }
    }

    public static int[][] cekStock() {
        System.out.println("Stock bunga: ");
        System.out.printf(
            "%-8s%-10s%-10s%-10s%-10s\n",
             "Cabang", "aglonema",
                    "keladi", "alocasia", "mawar"
        );
        for (int i = 0; i < tokoBunga.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < tokoBunga[i].length; j++) {
                System.out.printf("%10s", tokoBunga[i][j]);
            }
            System.out.println();
        }
        return tokoBunga;
    }

    public static int[][] penguranganStock() {
        Scanner sc = new Scanner(System.in);
        int stock[][] = new int [cabang][jenisTanaman];
        do {
            System.out.println("Apakah ada pengurangan stock (y/n)");
            String y = sc.nextLine();
            if (y.equalsIgnoreCase("y")){
                // input data
                System.out.println("Pengurangan stock ada di cabang mana?");
                int _cabang = (sc.nextInt() - 1);
                System.out.println("Bunga apa?");
                sc.nextLine();
                String bunga = sc.nextLine().toLowerCase();
                System.out.println("Berapa jumlah pengurangannya?");
                int jumlahKurang = sc.nextInt();
                sc.nextLine();
                // mencocokan nama bunga
                switch (bunga) {
                    case "aglonema":
                        tokoBunga[_cabang][aglonema] -= jumlahKurang;
                        break;
                    case "keladi":
                        tokoBunga[_cabang][keladi] -= jumlahKurang;
                        break;
                    case "alocasia":
                        tokoBunga[_cabang][alocasia] -= jumlahKurang;
                        break; 
                    case "mawar":
                        tokoBunga[_cabang][mawar] -= jumlahKurang;
                    default:
                        System.out.println("Nama bunga tidak valid");
                        break;
                }
            } 
            else {
                break;
            }
        } while(true);
        sc.close();
        return stock;
    }
}
