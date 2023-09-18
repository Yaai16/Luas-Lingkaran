package Modul_1;
import java.util.Scanner;
public class Soal24 {
    public static void main(String[] args) {
        final double PI = 3.141592;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai: "); double jariJari = input.nextDouble();

        double luas = PI * jariJari * jariJari;

        
        System.out.println("Luas Lingkaran Adalah: " + (Math.round(luas)));
    }
}
