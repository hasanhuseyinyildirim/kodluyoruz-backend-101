import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11;
        double  muzFiyat = 0.95, patlicanFiyat = 5.00, total; 

        double armut, elma, domates, muz, patlican;

        System.out.print("Armut Kaç Kilo ? :");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = input.nextDouble();

        total = armut*armutFiyat + elma*elmaFiyat + domates*domatesFiyat + muz*muzFiyat + patlican*patlicanFiyat;

        System.out.println("Toplam Tutar : " + total + "TL");
        
        
    }
}
