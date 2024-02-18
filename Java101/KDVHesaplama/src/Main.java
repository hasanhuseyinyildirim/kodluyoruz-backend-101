
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double paraTutari,kdvTutari,yeniTutar,kdvOrani ;

        System.out.print("Fiyat Tutarını Giriniz:");
        paraTutari = input.nextDouble();

        kdvOrani = (paraTutari>1000) ? 0.18 : 0.08;

        kdvTutari = paraTutari * kdvOrani;
        yeniTutar = kdvTutari + paraTutari;

        System.out.println("KDV'siz Fiyat : " + paraTutari);
        System.out.println("KDV Oranı : "  + kdvOrani);
        System.out.println("KDV'li Fiyat : " + yeniTutar);
        System.out.println("KDV Tutarı : " + kdvTutari);
    }
}