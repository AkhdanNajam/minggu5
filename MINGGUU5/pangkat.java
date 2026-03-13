package MINGGUU5;

public class pangkat {
    int nilai;
    int pangkat;

    // Konstruktor
    pangkat(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // Method Brute Force
    int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 1; i <= n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    // Method Divide and Conquer
    int pangkatDC(int a, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return a;
        }

        int hasil = pangkatDC(a, n/2);

        if(n % 2 == 0){
            return hasil * hasil;
        }else{
            return hasil * hasil * a;
        }
    }
}