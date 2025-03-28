package Minggu7;

import java.util.Scanner;

public class MahasiswaDemo7 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumMhs;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumMhs = input.nextInt();
        MahasiswaBerprestasi7 listMahasiswa = new MahasiswaBerprestasi7(jumMhs);

        listMahasiswa.tambah(new Mahasiswa7("111", "adi", "2", 3.5));
        listMahasiswa.tambah(new Mahasiswa7("222", "tio", "2", 3.7));
        listMahasiswa.tambah(new Mahasiswa7("333", "ila", "2", 3.0));
        listMahasiswa.tambah(new Mahasiswa7("444", "lia", "2", 3.4));
        listMahasiswa.tambah(new Mahasiswa7("555", "fia", "2", 3.2));

        System.out.println("Masukkan data mahasiswa: ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Masukkan nim mahasiswa ke-" + (i + 1)+ ": ");
            String nim = input.nextLine();
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1)+ ": ");
            String nama = input.nextLine();
            System.out.print("Masukkan kelas mahasiswa ke-" + (i + 1)+ ": ");
            String kelas = input.nextLine();
            System.out.print("Masukkan ipk mahasiswa ke-" + (i + 1)+ ": ");
            double ipk = input.nextDouble();
            input.nextLine();
            System.out.println();
            listMahasiswa.tambah(new Mahasiswa7(nim, nama, kelas ,ipk));
        } 
        listMahasiswa.tampil();
        // melakukan sequential search
        System.out.println("------------------");
        System.out.println("Pencarian data");
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("Ipk: ");
        double cari = input.nextDouble();
        System.out.println("Menggunakan sequential search");
        double posisi = listMahasiswa.sequentialSearch(cari);
        int pss = (int)posisi;
        listMahasiswa.tampilPosisi(cari, pss);
        listMahasiswa.tampilDataSearch(cari, pss);

        System.out.println("------------------");
        System.out.println("Pencarian data");
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("Ipk: ");
        double cari2 = input.nextDouble();
        System.out.println("Menggunakan binary search");
        System.out.println("------------------");
        // sort data dulu
        listMahasiswa.insertionSort(); // descending
        double posisi2 = listMahasiswa.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int)posisi2;
        listMahasiswa.tampilPosisi(cari2, pss2);
        listMahasiswa.tampilDataSearch(cari2, pss2);
               
        input.close();
    }
}
