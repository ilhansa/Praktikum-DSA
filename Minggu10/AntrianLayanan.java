package Minggu10;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        size = 0;
        rear = -1;
    }
    
    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void tambahAntrian(Mahasiswa mhs) {
        if(isFull()) {
            System.out.println("Antrian penuh");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    Mahasiswa layaniAntrian() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    void lihatTerdepan() {
        if(isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan");
            System.out.println("Nim-Nama-Prodi-Kelas");
            data[front].tampilkanData();
        }
    }

    void tampilkanSemua() {
        if (isEmpty()) {
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
        }
        System.out.println("Antrian terakhir ");
        
        data[rear].tampilkanData();
    }

    void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian dikosongkan");
        }
        else {
            System.out.println("Antrian kosong");
        }
    }

    int getJumlahAntrian() {
        return size;
    }

}