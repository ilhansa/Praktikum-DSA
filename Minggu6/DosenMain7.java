package Minggu6;

import java.util.Scanner;

public class DosenMain7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen7 dataDosen = new DataDosen7();
        Dosen7[] listDosen = new Dosen7[10];

        // Dosen7 ds1 = new Dosen7("1", 30);
        // Dosen7 ds2 = new Dosen7("2", 40);
        // Dosen7 ds3 = new Dosen7("3", 25);
        // Dosen7 ds4 = new Dosen7("4", 59);
        // Dosen7 ds5 = new Dosen7("5", 33);
        // Dosen7 ds6 = new Dosen7("6", 42);
        // Dosen7 ds7 = new Dosen7("7", 60);
        // Dosen7 ds8 = new Dosen7("8", 57);
        // Dosen7 ds9 = new Dosen7("9", 44);
        // Dosen7 ds10 = new Dosen7("10", 44);

        // listDosen.tambah(ds1);
        // listDosen.tambah(ds2);
        // listDosen.tambah(ds3);
        // listDosen.tambah(ds4);
        // listDosen.tambah(ds5);
        // listDosen.tambah(ds6);
        // listDosen.tambah(ds7);
        // listDosen.tambah(ds8);
        // listDosen.tambah(ds9);
        // listDosen.tambah(ds10);

        // listDosen.tampil(); 
        // listDosen.sortingAsc();
        // System.out.println("Setelah disorting (ASC)");
        // listDosen.tampil();
        // listDosen.sortingDsc();
        // System.out.println("Setelah disorting (DSC)");
        // listDosen.tampil();

        int menu;
        do {
        System.out.println("=== Menu ===");
        System.out.println("1. tambah data");
        System.out.println("2. tampil data");
        System.out.println("3. sorting(ASC)");
        System.out.println("4. sorting(DSC)");
        System.out.println("5. keluar");
        System.out.print("Pilih menu: ");
        menu = input.nextInt();

        switch (menu) {
            case 1: 
                System.out.println("masukkan data dosen (10 dosen)");
                for (int i = 0; i < listDosen.length; i++) {
                    listDosen[i] = new Dosen7();
                    input.nextLine();
                    System.out.println("data dosen ke-" + (i + 1) + ": ");
                    System.out.println("masukkan kode: ");
                    listDosen[i].kode = input.nextLine();

                    System.out.println("masukkan nama: ");
                    listDosen[i].nama = input.nextLine();

                    System.out.println("masukkan jenis kelamin (pria/wanita): ");
                    String jk = input.nextLine();
                    if (jk.equalsIgnoreCase("pria")) {
                        listDosen[i].jenisKelamin = true;
                    } else if (jk.equalsIgnoreCase("wanita")) {
                        listDosen[i].jenisKelamin = false;
                    } else {
                        System.out.println("jenis kelamin default (wanita)");
                        listDosen[i].jenisKelamin = false;
                    }

                    System.out.println("masukkan usia: ");
                    listDosen[i].usia = input.nextInt();
                    dataDosen.tambah(listDosen[i]);
                    System.out.println("--------------");
                }
                break;
            
            case 2: 
                if (dataDosen.idx == 0) { // cek data kosong atau tidak
                    System.out.println("belum ada data dosen");
                } else {
                    dataDosen.tampil();
                }

                break;
            
            case 3:
                if (dataDosen.idx == 0) {
                    System.out.println("belum ada data dosen");
                } else {
                    dataDosen.sortingAsc();
                    System.out.println("data telah disorting (ASC)");
                }
                break;
            
            case 4:
                if (dataDosen.idx == 0) {
                    System.out.println("belum ada data dosen");
                } else {
                    dataDosen.sortingDsc();
                    System.out.println("data telah disorting (DSC)");
                }
                break;
            
            case 5:
                System.out.println("keluar");
                break;

            default:
                System.out.println("pilihan tidak valid");
                break;
        }
        } while(menu != 5);
        input.close();
    }
}
