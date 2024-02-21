import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         Scanner input = new Scanner(System.in);

         int mesafe,yas,tip;
         double fiyat,indirim;

         System.out.print("Mesafeyi km türünden giriniz :");
         mesafe =input.nextInt();

         System.out.print("Yaşınızı giriniz :");
         yas =input.nextInt();

         System.out.print("Yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş ) :");
         tip =input.nextInt();

        fiyat = 0.1*mesafe;

        if (yas > 0 && mesafe > 0 && (tip == 1 || tip == 2)){
            if (yas < 12){
                indirim = fiyat * 0.5;
                fiyat = fiyat - indirim;
            }else if (yas >= 12 && yas < 24){
                indirim = fiyat * 0.1;
                fiyat = fiyat - indirim;
            }else if (yas >= 65 ){
                indirim = fiyat * 0.3;
                fiyat = fiyat - indirim;
            }
        }else {
            System.out.print("Hatalı Veri Girdiniz !");
        }

        if (tip == 2){
            indirim = fiyat * 0.2;
            fiyat = (fiyat -indirim)*2;
        }

        System.out.print("Toplam Tutar = " +fiyat +"TL");
    }
}
