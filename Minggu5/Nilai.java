package Minggu5.BruteForceDivideAndConquer;

public class Nilai {
    public static void main(String[] args) {
        int[] nilaiUts = {
            78, 85, 90, 76,
            92, 88, 80, 82
        }; 

        int[] nilaiUas = {
            82, 88, 87, 79,
            95, 85, 83, 84
        };

        int nilaiTerbesar = nilaiTerbesar(nilaiUts, 0, (nilaiUts.length - 1));
        System.out.println("Nilai terbesar: " + nilaiTerbesar);

        int nilaiTerendah = nilaiTerendah(nilaiUts, 0, (nilaiUts.length - 1));
        System.out.println("Nilai terendah: " + nilaiTerendah);

        System.out.println("Nilai rata-rata uas: " + rataNilai(nilaiUas));
    }
    
    static int nilaiTerbesar(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l+r) / 2 ;
        int nilaiL = nilaiTerbesar(arr, l, mid);
        int nilaiR = nilaiTerbesar(arr, mid + 1, r);
        int terbesar;
        if (nilaiL < nilaiR) {
            terbesar = nilaiR;
        } else {
            terbesar = nilaiL;
        }
        return terbesar;
    }

    static int nilaiTerendah(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l+r) / 2 ;
        int nilaiL = nilaiTerendah(arr, l, mid);
        int nilaiR = nilaiTerendah(arr, mid + 1, r);
        int terendah;
        if (nilaiL > nilaiR) {
            terendah = nilaiR;
        } else {
            terendah = nilaiL;
        }
        return terendah;
    }

    static double rataNilai(int[] arr) {
        double totalNilai = 0;
        for (int i = 0; i < arr.length; i++) {
            totalNilai += arr[i];
        }
        double nilaiAkhir = (totalNilai / arr.length);
        return nilaiAkhir;
    }
}
