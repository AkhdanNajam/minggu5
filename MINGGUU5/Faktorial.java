package MINGGUU5;

public class Faktorial {
    int nilai;

    // Method Brute Force (menggunakan perulangan)
    int faktorialBF(int n){
        int fakto = 1;
        for(int i = 1; i <= n; i++){
            fakto = fakto * i;
        }
        return fakto;
    }

    // Method Divide and Conquer (rekursif)
    int faktorialDC(int n){
        if(n == 1){
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}