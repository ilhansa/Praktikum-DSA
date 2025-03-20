package Minggu6;

public class SortingMain7 {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 12, 19, 8, 1, 29, 22, 4};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 9, 3, 4};

        Sorting7 dataUrut1 = new Sorting7(a, a.length);
        System.out.println("data");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("data sudah dirutukan dengan bubble sort");
        dataUrut1.tampil();

        Sorting7 dataUrut2 = new Sorting7(b, b.length); 
        System.out.println("data");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("data sudah dirutukan dengan selection sort");
        dataUrut2.tampil();

        Sorting7 dataUrut3 = new Sorting7(c, c.length);
        System.out.println("data");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("data sudah diurutkan dengan insertion sort");
        dataUrut3.tampil();
    }
}
