package Minggu7;

import java.util.Arrays;

public class DosenDemo7 {
    public static void main(String[] args) {
        int jumlah = 7;
        DataDosen7 listDosen = new DataDosen7(jumlah);

        Dosen7 d1 = new Dosen7("1", "ali", 52);
        Dosen7 d2 = new Dosen7("2", "bima", 54);
        Dosen7 d3 = new Dosen7("3", "denis", 40);
        Dosen7 d4 = new Dosen7("4", "ela", 35);
        Dosen7 d5 = new Dosen7("5", "farid",69);
        Dosen7 d6 = new Dosen7("6", "gilang",52);
        Dosen7 d7 = new Dosen7("7", "herman", 92);

        listDosen.tambah(d1);
        listDosen.tambah(d2);
        listDosen.tambah(d3);
        listDosen.tambah(d4);
        listDosen.tambah(d5);
        listDosen.tambah(d6);
        listDosen.tambah(d7);

        listDosen.pencarianDataSequential7("herman");
        listDosen.sortingAsc();
        int mid = listDosen.pencarianDataBinarySearch7(52, 0, jumlah - 1);
        if (mid != -1) {
            int[] hasil = listDosen.cariSemua(52, mid);
            System.out.println("Ditemukan di indeks: " + Arrays.toString(hasil));
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
