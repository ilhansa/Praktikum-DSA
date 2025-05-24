package Minggu11;

import java.util.Scanner;

public class SLLmain7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList linkedList = new SingleLinkedList();
        
        // Mahasiswa7[] arr = new Mahasiswa7[4];
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("\nData mahasiswa ke-" + (i + 1));
        //     System.out.print("Nama  : ");
        //     String nama = sc.nextLine();

        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();

        //     System.out.print("NIM   : ");
        //     String nim = sc.nextLine();

        //     System.out.print("Ipk : ");
        //     int ipk = sc.nextInt();
        //     sc.nextLine(); // buang newline

        //     arr[i] = new Mahasiswa7(nama, kelas, nim, ipk);
        // }

        // linkedList.print();
        // linkedList.addFirst(arr[3]);
        // linkedList.print();
        // linkedList.addLast(arr[0]);
        // linkedList.print();
        // linkedList.insertAfter(arr[3].nama, arr[2]); //arr[3].nama = "ilmansyah"
        // linkedList.insertAt(2, arr[1]);
        // linkedList.print();
        
        /////////////////////////////////

        Mahasiswa7 mhs1 = new Mahasiswa7("ilsa", "1d", "1", 1);
        Mahasiswa7 mhs2 = new Mahasiswa7("ilmansyah", "1d", "2", 2);
        Mahasiswa7 mhs3 = new Mahasiswa7("salih", "1d", "3", 3);
        Mahasiswa7 mhs4 = new Mahasiswa7("ilhan", "1d", "4", 4);

        linkedList.print();
        linkedList.addFirst(mhs4);
        linkedList.print();
        linkedList.addLast(mhs1);
        linkedList.print();
        linkedList.insertAfter("ilhan", mhs3);
        linkedList.insertAt(2, mhs2);
        linkedList.print();
        
        System.out.println("Data indeks ke-1");
        linkedList.getData(1);
        System.out.println("Data mahasiswa ilmansyah ada di indeks: " 
        + linkedList.indexOf("ilmansyah"));
        System.out.println();

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.print();
        linkedList.removeAt(0);
        linkedList.print();

        sc.close();
    }
}
