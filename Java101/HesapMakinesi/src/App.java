import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,islem;

        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        islem = input.nextInt();

        switch(islem){
            case 1:
            System.out.println("Sonuç : " + (sayi1+sayi2));
            break;
            case 2:
            System.out.println("Sonuç : " + (sayi1-sayi2));
            break;
            case 3:
            System.out.println("Sonuç : " + (sayi1*sayi2));
            break;
            case 4:
             if (sayi2 == 0){
                System.out.println("0 ile bölme işlemi yapılamaz !");
             }
            else {
                System.out.println("Sonuç : " + (sayi1/sayi2));
            }
            break;
            default:
            System.out.println("İstenenden Farklı Bir Sayı Seçtiniz!!");
        }

       
    }
}
