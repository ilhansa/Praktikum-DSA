package Minggu6;

public class MahasiswaBerprestasi {
    Mahasiswa7[] listMhs = new Mahasiswa7[5];
    int idx;

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
}
