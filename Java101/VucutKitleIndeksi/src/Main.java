import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int kilo;
        double boy,indeks;


        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);
    }
}
