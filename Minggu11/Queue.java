package Minggu11;

public class Queue { // Linked list
    Node front;
    Node rear;
    int size;
    int max;

    Queue(int max) {
        this.max = max;
    }

    boolean isFull() {
        return (size == max && front != null && rear != null); 
    }

    boolean isEmpty() {
        return (size == 0 && front == null && rear == null);
    }

    void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Queue penuh");
            return;
        }

        Node newNode = new Node(mhs, null);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return null;
        } 

        Mahasiswa mhs = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
        return mhs;
    }

    void print() {
        if (!isEmpty()) {
            Node node = front;
            System.out.println("Isi queue");
            while (node != null) {
                node.data.tampilInformasi();
                node = node.next;
            }
            System.out.println("");
        } else {
            System.out.println("Queue kosong");
        }
    }

    int getSize() {
        return size;
    }

    Mahasiswa getFront() {
        return front.data;
    }

    Mahasiswa getRear() {
        return rear.data;
    }
}
