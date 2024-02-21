import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int N,sayi1,sayi2;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        N=input.nextInt();
        System.out.print("1. Sayıyı giriniz:");
        sayi1=input.nextInt();
        int enBuyuk=sayi1,enKucuk=sayi1;

        int i=2;
        while(i<=N){
            System.out.print(i+". Sayıyı giriniz:");
            sayi2=input.nextInt();
            enBuyuk=(enBuyuk>sayi2)?enBuyuk:sayi2;
            enKucuk=(enKucuk>sayi2)?sayi2:enKucuk;



            i++;
        }
        System.out.println("En Büyük Sayı : " + enBuyuk);
        System.out.print("En Küçük Sayı : " + enKucuk);
    }
}
//Kaç tane sayı gireceksiniz: 4
// 1. Sayıyı giriniz: 16
// 2. Sayıyı giriniz: -22
// 3. Sayıyı giriniz: -15
// 4. Sayıyı giriniz: 100
// En büyük sayı: 100
// En küçük sayı: -22
