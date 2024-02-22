import java.util.Scanner;

public class App {

    static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplanacak Sayıları Girin\nİşlem Ekranına Dönmek İçin 0 Tuşlayın!");
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
        
    }
    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
        
    }
    static void divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
        
    }
    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
        
    }
    static void fact(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
        
    }
    static void mod(){
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("İşlem Ekranına Dönmek İçin 0 Tuşlayın!");
            System.out.print("Modu alınacak sayıyı giriniz :");
            int number = scan.nextInt();
            if(number==0)
                break;
            System.out.print("Mod değerini giriniz :");
            int modNumber = scan.nextInt();
            int result = 1;
            if(modNumber==0 )
                break;

            result = number % modNumber;
  
            System.out.println("Sonuç : " + result);
        }
    }

    static void rect(){
        Scanner scan = new Scanner(System.in);

        int shortEdge,longEdge,area,perimeter;

        while(true){
            System.out.println("İşlem Ekranına Dönmek İçin 0 Tuşlayın!");
            System.out.print("Uzun Kenar Uzunluğunu Girin : ");
            longEdge =scan.nextInt();
            if(longEdge==0)
                break;
            System.out.print("Kısa Kenar Uzunluğunu Girin : ");
            shortEdge =scan.nextInt();
            if(shortEdge==0)
                break;

            area = longEdge*shortEdge;
            perimeter=2*(longEdge+shortEdge);

            System.out.println("Dikdörtgenin Alanı : " + area);
            System.out.println("Dikdörtgenin Çevresi : " + perimeter);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);
        int select;
        String menu ="1- Toplama İşlemi\n"
                    +"2- Çıkarma İşlemi\n"
                    +"3- Çarpma İşlemi\n"
                    +"4- Bölme işlemi\n"
                    +"5- Üslü Sayı Hesaplama\n"
                    +"6- Faktoriyel Hesaplama\n"
                    +"7- Mod Alma\n"
                    +"8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    +"0- Çıkış Yap\n";


    do{
        System.out.print(menu);
        System.out.print("Yapılacak İşlemi Seçin : ");
        select=input.nextInt();

        switch(select){
            case 1:
                plus();
            break;
            case 2:
                minus();
            break;
            case 3:
                times();
            break;
            case 4:
                divided();
            break;
            case 5:
                power();
            break;
            case 6:
                fact();
            break;
            case 7:
                mod();
            break;
            case 8:
                rect();
            break;
            case 0:
            break;
            default:
            System.out.println("Yanlış bir değer girdiniz,tekrar deneyin! ");
        }
        
    }while(select !=0);
    }
}


