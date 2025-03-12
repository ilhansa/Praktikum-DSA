package Minggu5.BruteForceDivideAndConquer;

public class Faktorial {

    int FaktorialBf(int n){
        int fakto = 1;
        int i = 1; 
        while (i <= n) {
            fakto *= i;
            i++;
        }
        return fakto;
    }

    int FaktorialDc(int n){
        if(n == 1) {
            return 1;
        } else {
            int fakto = n * FaktorialDc(n - 1);
            return fakto;
        }
    }    
}
