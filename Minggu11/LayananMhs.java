package Minggu11;

import java.util.Scanner;

public class LayananMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(10);
        int pilih;
        do {
            System.out.println("Menu layanan: ");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Layani mahasiswa");
            System.out.println("3. Lihat mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Jumlah Mahasiswa dalam antrian");
            System.out.println("6. Lihat mahasiswa terakhir");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            
            switch (pilih) {
                case 1: 
                    if (!queue.isFull()) {
                        System.out.println("Nama: ");
                        String nama = sc.nextLine();
                        System.out.println("Nim: ");
                        String nim = sc.nextLine();
                        System.out.println("Kelas: ");
                        String kelas = sc.nextLine();
                        Mahasiswa mhs = new Mahasiswa(nama, nim, kelas);
                        queue.enqueue(mhs);
                        break;
                    } else {
                        System.out.println("Penuh");
                        break;
                    }
                
                case 2:
                    if (!queue.isFull()) {
                        Mahasiswa dilayani = queue.dequeue();
                        if (dilayani != null) {
                            System.out.println("Melayani mahasiswa: ");
                            dilayani.tampilInformasi();
                            break;
                        }
                    } else {
                        System.out.println("Penuh");
                        break;
                    }

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        Mahasiswa depan = queue.getFront();
                        System.out.println("Antrian pertama adalah: ");
                        depan.tampilInformasi();
                    }
                    break;
                
                case 4:
                    queue.print();
                    break;

                case 5: 
                    System.out.println("Jumlah dalam antrian: " 
                    + queue.getSize());
                    break;

                case 6:
                    
                    if (queue.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        Mahasiswa terakhir = queue.getRear();
                        System.out.println("Antrian terakhir adalah: ");
                        terakhir.tampilInformasi();
                    }
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
