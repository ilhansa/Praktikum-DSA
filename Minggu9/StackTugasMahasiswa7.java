package Minggu9;

public class StackTugasMahasiswa7 {
    Mahasiswa7[] stack;
    int top;
    int size;
    int bottom;

    StackTugasMahasiswa7(int size) {
        this.size = size;
        stack = new Mahasiswa7[size];
        top = -1;
        bottom = 0;
    }

    int total() {
        return top + 1;
    }

    Mahasiswa7 bottom() {
        return stack[bottom];
    }

    boolean isFull() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa7 mhs) {
        if(!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi");
        }
    }

    Mahasiswa7 pop() {
        if(!isEmpty()) {
            Mahasiswa7 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai");
            return null;
        }
    }

    Mahasiswa7 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(
                stack[i].nama + "\t" + stack[i].nim
                 + "\t" + stack[i].kelas);
        }
        System.out.println();
    }

    String konversiDesimalKeBiner(int nilai) {
        StackKonversi7 stack = new StackKonversi7();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        // while (nilai != 0) {
        //     int sisa = nilai % 2;
        //     stack.push(sisa);
        //     nilai = nilai / 2;
        // }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
