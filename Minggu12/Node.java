package Minggu12;

public class Node {
    Mahasiswa data;
    Node next;
    Node prev;

    Node(Mahasiswa data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
