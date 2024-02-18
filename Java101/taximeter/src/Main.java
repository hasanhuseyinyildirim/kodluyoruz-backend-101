
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km,perKm = 2.20,tutar,ilkTutar,total;
        ilkTutar = 10;

        System.out.print("Gidilen km değerinin giriniz : ");
        km = input.nextDouble();

        tutar = km*perKm;

        total =ilkTutar+tutar;

        total = (total > 20) ? total : 20;

        System.out.println("Ödenecek toplam tutar :" +total);

    }
}
