package Minggu12;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    DoubleLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void insertAfter(String keyNim, Mahasiswa data) {
        Node current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM: " + keyNim + " tidak ditemukan");
            return;
        }

        Node newNode = new Node(data);
        
        // jika current adalah tail
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // sisipkan ditenggah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        } 
        String nama;

        if (head == tail) {
            nama = head.data.nama;
            head = tail = null;
        } else {
            nama = head.data.nama; 
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data sudah berhasil terhapus, data yang dihapus adalah " 
        + nama);
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        String nama;

        if (head == tail) {
            nama = tail.data.nama;
            head = tail = null;
        } else {
            nama = tail.data.nama;
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus, data yang dihapus adalah " 
        + nama);
    }

    Node search(String keyNim) {
        Node current = head;

        while (current != null) {
            if (current.data.nim.equals(keyNim)) {
                return current; // ditemukan
            }
            current = current.next;
        }

        return null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            Node current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    void add(int index, Mahasiswa mhs) {
        Node newNode = new Node(mhs);

        if (index == 0) {
            newNode.next = head;
            return;
        }

        Node current = head;
        int count = 0;
        while(current != null && count < index - 1) {
            current = current.next;
            count++;
        }
    
        if (current == null) {
            System.out.println("Index di luar batas. Gagal menambahkan.");
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan di indeks ke-" 
        + index);
    }

    void removeAfter(String keyNama) {
        Node current = head;
        while (current != null && !current.data.nama.equals(keyNama)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNama + " tidak ditemukan atau tidak ada.");
            return;
        }
        Node toDelete = current.next;
        if (toDelete == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;
        System.out.println("Node setelah NIM " + keyNama + " berhasil dihapus.");
    }

    void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Mahasiswa terhapus = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data yang terhapus adalah : ");
            terhapus.tampil();
        }
    }

    void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.print("Data pada tail: ");
            tail.data.tampil();
        }
    }

    void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.print("Data pada head: ");
            head.data.tampil();
        }
    }

    void getIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Indeks di luar batas atau list kosong!");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.print("Data pada indeks ke-" + index + ": ");
        current.data.tampil();
    }

    int getSize() {
        return size;
    }
}
