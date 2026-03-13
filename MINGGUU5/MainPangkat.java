package MINGGUU5;
import java.util.Scanner;

public class MainPangkat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];

        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int nilai = input.nextInt();

            System.out.print("Masukkan pangkat elemen ke-" + (i+1) + ": ");
            int pang = input.nextInt();

            png[i] = new pangkat(nilai, pang);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }

        input.close();
    }
}