package Minggu5.BruteForceDivideAndConquer;

public class Sum {
    
    double Keuntungan[];

    Sum(int el) {
        Keuntungan = new double[el];
    }

    double totalBf() {
        double total = 0;
        for (int i = 0; i < Keuntungan.length; i++) {
            total = total + Keuntungan[i];
        }
        return total;
    }

    double totalDc(double[] arr, int l, int r) {
        if(l == r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        double lsum = totalDc(arr, l, mid);
        double rsum = totalDc(arr, (mid+1), r);
        return lsum + rsum;
    }
}
