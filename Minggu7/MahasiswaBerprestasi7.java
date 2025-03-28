package Minggu7;

public class MahasiswaBerprestasi7 {
    Mahasiswa7[] listMhs;
    int idx;

    MahasiswaBerprestasi7(int jumMhs) {
        listMhs = new Mahasiswa7[jumMhs];
        idx = 0;
    }

    void tambah(Mahasiswa7 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa7 mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println("----------------");
        }
    }

    void bubbleSort() { // descending
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if(listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa7 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() { // ascending
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa7 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort() { // descending
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa7 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan ipk " +x+ " ditemukan pada indeks " + pos);
        } 
        else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t: " + listMhs[pos].nim);
            System.out.println("nama\t: " + listMhs[pos].nama);
            System.out.println("ipk\t: " + listMhs[pos].kelas);
            System.out.println("nim\t: " + x);
        }
        else {
            System.out.println("Data dengan ipk " +x+ " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }
            else if (cari > listMhs[mid].ipk) {
                return findBinarySearch(cari, left, mid - 1);
            } 
            else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
