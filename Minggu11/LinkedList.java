package Minggu11;

public class LinkedList {
    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }

    void clear() {
        head = tail = null;
    }

    void add(Mahasiswa mhs) {
        Node newNode = new Node(mhs, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void addFirst(Mahasiswa mhs) {
        Node newNode = new Node(mhs, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void getData(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.data.tampilInformasi();
    }

    void print() {
        if (!isEmpty()) {
            Node node = head;
            System.out.println("Isi linked list");
            while (node != null) {
                node.data.tampilInformasi();
                node = node.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }
}
