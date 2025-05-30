package Minggu10;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    
    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int dt) {
        if(isFull()) {
            System.out.println("Queue full");
        } 
        else {
            if (isEmpty()){
                front = rear = 0;
            } else {
                if(rear == max - 1) {
                rear = 0;
                }
                else {
                rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    int dequeue() {
        int dt = 0;
        if(isEmpty()) {
            System.out.println("Queue kosong");
        }
        else {
            dt = data[front];
            size--;
            if(isEmpty()) {
                front = rear - 1;
            } 
            else {
                if(front == max - 1) {
                    front = 0;
                } 
                else {
                    front++;
                }
            }
        }
        return dt;
    }

    void peek() {
        if(!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong");
        }
    }

    void print() {
        if(isEmpty()) {
            System.out.println("Queue kosong");
        }
        else {
            int i = front;
            while(i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen:" + size); 
        }
    }

    void clear() {
        if(!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue sudah dikosongkan");
        }
        else {
            System.out.println("Queue kosong");
        }
    }
}