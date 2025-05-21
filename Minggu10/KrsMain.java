package Minggu10;

import java.util.Scanner;

public class KrsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKrs antrian = new AntrianKrs(10);
        int pilih;
        do {
            System.out.println("Menu layanan: ");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Layani 2 mahasiswa");
            System.out.println("3. Lihat 2 mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah Mahasiswa dalam antrian");
            System.out.println("6. Lihat mahasiswa terakhir");
            System.out.println("7. Kosongkan antrian");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1: 
                    System.out.println("Nim: ");
                    String nim = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                
                case 2:
                    Mahasiswa[] dilayani = antrian.layaniAntrian();
                    for (Mahasiswa m : dilayani) {
                        if (m != null) {
                            m.tampilkanData();
                        } else {
                            System.out.println("kosong");
                        }
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;
                
                case 4:
                    antrian.lihatSemua();
                    break;

                case 5: 
                    System.out.println("Jumlah dalam antrian: " 
                    + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;

                case 7:
                    antrian.clear();
                    break;
                    
                case 0:
                System.out.println("Terimakasih");
                break;
                
                default: 
                    System.out.println("Pilihan tidak valid");
            }
        } while(pilih != 0);
    
        sc.close();
    }

}
