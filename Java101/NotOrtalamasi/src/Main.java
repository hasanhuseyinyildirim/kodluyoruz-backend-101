
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya  = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6.0;
        System.out.println("Not Ortalaması: " + ortalama);


        String str = ortalama < 60 ? "Sınıfta Kaldı": "Sınıfı geçti";

        System.out.println(str);




    }
}