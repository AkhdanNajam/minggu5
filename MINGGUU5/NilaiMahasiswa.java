package MINGGUU5;

public class NilaiMahasiswa {

    int uts[];
    int uas[];

    NilaiMahasiswa(int n){
        uts = new int[n];
        uas = new int[n];
    }

    // Divide and Conquer mencari UTS tertinggi
    int maxUTS(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;

        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);

        return (lmax > rmax) ? lmax : rmax;
    }

    // Divide and Conquer mencari UTS terendah
    int minUTS(int arr[], int l, int r){
        if(l == r){
            return arr[l];
        }

        int mid = (l + r) / 2;

        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);

        return (lmin < rmin) ? lmin : rmin;
    }

    // Brute Force rata-rata UAS
    double rataUAS(){
        double total = 0;

        for(int i = 0; i < uas.length; i++){
            total += uas[i];
        }

        return total / uas.length;
    }
}