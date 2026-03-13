package MINGGUU5;
import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        int[] arr = new int[elemen];

        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai elemen ke-" + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Hasil Penjumlahan dengan Brute Force = " + sumBF(arr, elemen));
        System.out.println("Hasil Penjumlahan dengan Divide Conquer = " + sumDC(arr, 0, elemen - 1));
    }

    // Method Brute Force
    static int sumBF(int[] arr, int n){
        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
        }
        return total;
    }

    // Method Divide and Conquer
    static int sumDC(int[] arr, int left, int right){
        if(left > right){
            return 0;
        }
        if(left == right){
            return arr[left];
        }
        
        int mid = (left + right) / 2;
        
        return sumDC(arr, left, mid) + sumDC(arr, mid + 1, right);
    }
}
