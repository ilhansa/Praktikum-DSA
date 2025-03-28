package Minggu7;

public class DataDosen7 {
    Dosen7[] listDosen;
    int idx;

    DataDosen7(int juml) {
        listDosen = new Dosen7[juml];
    }

    void tambah(Dosen7 dosen) {
        if (idx < listDosen.length) {
            listDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh");
        }
    }

    void tampil() {
        for (Dosen7 dosen7 : listDosen) {
            dosen7.tampil();
            System.out.println("-------------");
        }
    }

    void sortingAsc() { // bubble sort ascending
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                if (listDosen[j].usia < listDosen[j - 1].usia) {
                    Dosen7 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void sortingDsc() { // insertion sort ascending
        for (int i = 0; i < listDosen.length; i++) {
            Dosen7 temp = listDosen[i];
            int j = i;
            while (j > 0 && listDosen[j - 1].usia > temp.usia) {
                listDosen[j] = listDosen[j - 1];
                j--;
            }
            listDosen[j] = temp;
        }
    }

    int pencarianDataSequential7(String cari) { // cari berdasarkan nama
        int[] posisi = new int[listDosen.length]; 
        int ditemukan = 0;
        for (int i = 0; i < listDosen.length; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cari)) {
                posisi[ditemukan] = i;
                ditemukan++;
            }
        }
        // jika data tidak ditemukan
        if (ditemukan == 0) { 
            System.out.println("Data tidak ditemukan.");
            return -1;
        }
        // jika hanya 1 data yang ditemukan
        if (ditemukan == 1) {
            System.out.println("Data ditemukan di indeks: " + posisi[0]);
            return posisi[0];
        }
        // Jika lebih dari satu ditemukan
        System.out.println("Ditemukan lebih dari satu hasil.");
        System.out.print("Data ditemukan di indeks: ");
        for (int i = 0; i < ditemukan; i++) {
            System.out.print(posisi[i] + (i < ditemukan - 1 ? ", " : ""));
        }
        System.out.println();
        return posisi[0];
    }

    int pencarianDataBinarySearch7(int cari, int left, int right) { // cari berdasarkan usia
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listDosen[mid].usia) {
                return (mid);
            }
            else if (cari < listDosen[mid].usia) {
                return pencarianDataBinarySearch7(cari, left, mid - 1);
            } 
            else {
                return pencarianDataBinarySearch7(cari, mid + 1, right);
            }
        }
        return -1;
    }

    int[] cariSemua(int cari, int mid) {
        int[] count = {0};
        int[] hasil = new int[listDosen.length];
        int kiri = mid - 1;
        int kanan = mid + 1;

        // cari ke kiri
        while (kiri >= 0 && listDosen[kiri].usia == cari) {
            hasil[count[0]++] = kiri;
            kiri--;
        }

        // nilai tengah
        hasil[count[0]++] = mid;

        // cari ke kanan
        while (kanan < listDosen.length && listDosen[kanan].usia == cari) {
            hasil[count[0]++] = kanan;
            kanan++;
        }    
        
        int[] hasilAkhir = new int[count[0]];
        System.arraycopy(hasil, 0, hasilAkhir, 0, count[0]);
    
        return hasilAkhir;
    }
}
