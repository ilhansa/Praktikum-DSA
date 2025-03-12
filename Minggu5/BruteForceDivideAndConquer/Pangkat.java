package Minggu5.BruteForceDivideAndConquer;

public class Pangkat {

    int nilai;
    int pangkat;

    Pangkat(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // int pangkatBf(int a, int n) {
    //     int hasil = 1;
    //     for (int i = 0; i < n; i++) {
    //         hasil *= a;
    //     }
    //     return hasil;
    // }

    int pangkatBf() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai; 
        }
        return hasil;
    }

    int pangkatDc(int a, int n) {
        if(n == 1) {
            return a;
        } else {
            if(n%2 == 1){
                return (pangkatDc(a, n/2) * pangkatDc(a, n/2) * a);
            } else {
                return (pangkatDc(a, n/2) * pangkatDc(a, n/2));
            }
        }
    }
}
