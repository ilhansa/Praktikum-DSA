package Minggu6;

import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        MahasiswaBerprestasi list2 = new MahasiswaBerprestasi();
        MahasiswaBerprestasi list3 = new MahasiswaBerprestasi();
        Mahasiswa7 m1 = new Mahasiswa7("123", "zidan", "2A", 3.2);
        Mahasiswa7 m2 = new Mahasiswa7("124", "ayu", "2A", 3.5);
        Mahasiswa7 m3 = new Mahasiswa7("125", "sofi", "2A", 3.1);
        Mahasiswa7 m4 = new Mahasiswa7("126", "sita", "2A", 3.9);
        Mahasiswa7 m5 = new Mahasiswa7("127", "miki", "2A", 3.7);

        Mahasiswa7 mhs1 = new Mahasiswa7("123", "ali", "2b", 3.9);
        Mahasiswa7 mhs2 = new Mahasiswa7("124", "ila", "2b", 3.1);
        Mahasiswa7 mhs3 = new Mahasiswa7("125", "agus", "2b", 3.6);
        Mahasiswa7 mhs4 = new Mahasiswa7("126", "tika", "2b", 3.3);
        Mahasiswa7 mhs5 = new Mahasiswa7("127", "udin", "2b", 3.2);

        Mahasiswa7 mh1 = new Mahasiswa7("111", "ayu", "2c", 3.7);
        Mahasiswa7 mh2 = new Mahasiswa7("222", "dika", "2c", 3.0);
        Mahasiswa7 mh3 = new Mahasiswa7("333", "ila", "2c", 3.8);
        Mahasiswa7 mh4 = new Mahasiswa7("444", "susi", "2c", 3.1);
        Mahasiswa7 mh5 = new Mahasiswa7("555", "yayuk", "2c", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        list2.tambah(mhs1);
        list2.tambah(mhs2);
        list2.tambah(mhs3);
        list2.tambah(mhs4);
        list2.tambah(mhs5);

        list3.tambah(mh1);
        list3.tambah(mh2);
        list3.tambah(mh3);
        list3.tambah(mh4);
        list3.tambah(mh5);

        // System.out.println("data belum disorting");
        // list.tampil();

        // System.out.println("data mahasiswa telah disorting menggunakan bubblesort (DESC)");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("data belum disorting");
        // list2.tampil();

        // System.out.println("data mahasiswa telah disorting menggunakan selectionsort (ASC)");
        // list2.selectionSort();
        // list2.tampil();

        // System.out.println("data belum disorting");
        // list3.tampil();

        // System.out.println("data mahasiswa telah disorting menggunakan insertionsort (ASC)");
        // list3.insertionSort();
        // list3.tampil();

        MahasiswaBerprestasi listMahasiswa = new MahasiswaBerprestasi();
        Mahasiswa7[] listMhs = new Mahasiswa7[5];
        System.out.println("Masukkan data mahasiswa: ");
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i] = new Mahasiswa7();
            System.out.print("Masukkan nim mahaiswa ke-" + (i + 1)+ ": ");
            listMhs[i].nim = input.nextLine();
            input.nextLine();
            System.out.print("Masukkan nama mahaiswa ke-" + (i + 1)+ ": ");
            listMhs[i].nama = input.nextLine();
            System.out.print("Masukkan kelas mahaiswa ke-" + (i + 1)+ ": ");
            listMhs[i].kelas = input.nextLine();
            System.out.print("Masukkan ipk mahaiswa ke-" + (i + 1)+ ": ");
            listMhs[i].ipk = input.nextDouble();
            System.out.println();
            listMahasiswa.tambah(listMhs[i]);
        }
        listMahasiswa.tampil();
        input.close();
    }
}
