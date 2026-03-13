package MINGGUU5;

public class sum {
 double keuangan [];
 sum (int el) {
        keuangan = new double [el]; 
 }  
 double totalBF () {
        double total = 0;
        for (int i = 0; i < keuangan.length; i++) {
            total += keuangan[i];
        }
        return total;
    }
 double totalDC (double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid + 1, r);
        return lsum + rsum;
    }
}
