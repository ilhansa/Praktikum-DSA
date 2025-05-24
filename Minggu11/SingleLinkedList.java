package Minggu11;

public class SingleLinkedList {
    NodeMahasiswa7 head;
    NodeMahasiswa7 tail;
    
    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            NodeMahasiswa7 tmp = head;
            System.out.println("Isi linked list");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(Mahasiswa7 input) {
        NodeMahasiswa7 nodeInput = new NodeMahasiswa7(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        } else {
            nodeInput.next = head;
            head = nodeInput;
        }
    }

    void addLast(Mahasiswa7 input) {
        NodeMahasiswa7 nodeInput = new NodeMahasiswa7(input, null);
        if (isEmpty()) {
            head = nodeInput;
            head.next = nodeInput;
        } else {
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }

    void insertAfter(String key, Mahasiswa7 input) {
        NodeMahasiswa7 nodeInput = new NodeMahasiswa7(input, null);
        NodeMahasiswa7 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                nodeInput.next = temp.next; 
                temp.next = nodeInput;
                if (nodeInput.next == null) {
                    tail = nodeInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }   

    void insertAt(int index, Mahasiswa7 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa7 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa7(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    void getData(int index) {
        NodeMahasiswa7 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    int indexOf(String key) {
        NodeMahasiswa7 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masing kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa7 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else {
            NodeMahasiswa7 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa7 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
