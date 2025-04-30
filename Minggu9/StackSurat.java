package Minggu9;

public class StackSurat {
    Surat7[] stack;
    int top;
    int size;

    StackSurat(int size) {
        this.size = size;
        stack = new Surat7[size];
        top = -1;
    }

    boolean isFull() {
        // if (top == size - 1){
        //     return true;
        // } else {
        //     return false;
        // }
        return top == size - 1;
    }

    boolean isEmpty() {
        // if (top == -1) {
        //     return true;
        // } else {
        //     return false;
        // }
        return top == -1;
    }

    void push(Surat7 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh");
        }
    }

    Surat7 pop() {
        if (!isEmpty()) {
            Surat7 surat = stack[top];
            top--; 
            return surat;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    Surat7 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].idSurat + "\t"
            + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t"
            + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
    }
}
