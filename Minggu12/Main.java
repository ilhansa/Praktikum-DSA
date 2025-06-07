package Minggu12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Menu double linked list mahasiswa: ");
            System.out.println("1. Tambah diawal");
            System.out.println("2. Tambah diakhir");
            System.out.println("3. Hapus diawal");
            System.out.println("4. Hapus diakhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Insert after");
            System.out.println("8. Add pada indeks tertentu");
            System.out.println("9. Remove after");
            System.out.println("10. Remove pada indeks tertentu");
            System.out.println("11. Get first");
            System.out.println("12. Get last");
            System.out.println("13. Get indeks");
            System.out.println("0. Keluar menu");
            System.out.println("Pilih menu");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1 -> {
                    Mahasiswa mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                }

                case 2 -> {
                    Mahasiswa mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                    
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.println("Masukkan nim yang dicari: ");
                    String nim = scan.nextLine();
                    Node found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.println("Masukkan nim: ");
                    String nim = scan.nextLine();
                    Mahasiswa mhs = inputMahasiswa(scan);
                    list.insertAfter(nim, mhs);
                    
                }
                case 8 -> {
                    System.out.println("Masukkan Index: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    Mahasiswa mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.println("Masukkan indeks: ");
                    String nama = scan.nextLine();
                    list.removeAfter(nama);
                    scan.nextLine();
                }
                case 10 -> {
                    System.out.println("Masukkan indeks: ");
                    int indeks = scan.nextInt();
                    list.remove(indeks);
                    scan.nextLine();
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.println("Masukkan indeks: ");
                    int indeks = scan.nextInt();
                    list.getIndex(indeks);
                    scan.nextLine();
                }
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println();
            }
        } while (pilih != 0);
        scan.close();
    }

    static Mahasiswa inputMahasiswa(Scanner scan) {
        System.out.println("Masukkan nama mahasiswa: ");
        String nama = scan.nextLine();

        System.out.println("Masukkan nim: ");
        String nim = scan.nextLine();

        System.out.println("Masukkan kelas: ");
        String kelas = scan.nextLine();

        System.out.println("Masukkan ipk: ");
        double ipk = scan.nextInt();
        
        return new Mahasiswa(nama, nim, kelas, ipk);
    }
}
