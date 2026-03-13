package MINGGUU5;
import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan difaktorialkan: ");
        int nilai = sc.nextInt();

        Faktorial fk = new Faktorial();

        System.out.println("Hasil Faktorial dengan Brute Force = " + fk.faktorialBF(nilai));
        System.out.println("Hasil Faktorial dengan Divide Conquer = " + fk.faktorialDC(nilai));
    }
}
