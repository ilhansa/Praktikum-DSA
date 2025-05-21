package Minggu10;

public class AntrianKrs {
    Mahasiswa[] data;
    Mahasiswa[] mhsDilayani = new Mahasiswa[2];
    int front;
    int rear;
    int max;
    int size;
    int sudahKrs; // yang sudah cetak krs
    
    
    AntrianKrs(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1; 
            size = 0;
            System.out.println("Antrian sudah dikosongkan");
        } 
        else {
            System.out.println("Antrian kosong");
        }        
    }

    void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian full");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    Mahasiswa[] layaniAntrian() { // mengosongkan 2 mahasiswa
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        for (int i = 0; i < mhsDilayani.length; i++) {
            mhsDilayani[i] = null;
        }
        
        int itr = getItr();
        for (int i = 0; i < itr; i++) {
            mhsDilayani[i] = data[front];
            front = (front + 1) % max;
            size--;
            sudahKrs++;
        }
        return mhsDilayani;
    }

    void lihatTerdepan() { // 2 terdepan
        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("2 Mahasiswa terdepan");
            System.out.println("Nim-Nama-Prodi-Kelas");
            int index = front;
            for (int i = 0; i < 2; i++) {
                if (data[index] != null) {
                    data[index].tampilkanData();
                    index = (index + 1) % max;
                } else {
                    System.out.println("data kosong");
                }
            }
        }
    }

    void lihatSemua() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Data mahasiswa dalam antrian");
        System.out.println("Nim-Nama-Prodi-Kelas");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Antrian akhir adalah: ");
        data[rear].tampilkanData();
    }

    int getItr() {
        return Math.min(size, 2);
    }

    int getJumlahAntrian() {
        return size;
    }

    int getSudahKrs() {
        return sudahKrs;
    }

    int getBelumKrs() {
        return size;
    }

}
