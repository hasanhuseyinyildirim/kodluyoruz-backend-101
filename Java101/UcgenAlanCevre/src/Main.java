
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,c;
        double u,cevre,alan;

        System.out.print("1.Kenarı Giriniz: ");
        a =input.nextInt();

        System.out.print("2.Kenarı Giriniz: ");
        b =input.nextInt();

        System.out.print("3.Kenarı Giriniz: ");
        c =input.nextInt();


       u=(a+b+c)/2;
       cevre = 2*u;
       alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin çevrei = " + cevre);
        System.out.println("Üçgenin alanı = " + alan);

    }
}
