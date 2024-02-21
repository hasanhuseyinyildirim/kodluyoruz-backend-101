import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input= new Scanner(System.in);

        int sayi,toplam=0;

        do{
            System.out.print("Sayı Giriniz :");
            sayi =input.nextInt();
            if (sayi%4 == 0){
                toplam +=sayi;
            }



        }while(sayi%2==0);
        System.out.print("4'ün katı olan sayıların toplamı : "+toplam);
    }
}
