import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int sayi,bolunen=0,ortalama=0;

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        int i=0;
        while( i <= sayi ){
            if( i % 3 == 0 && i % 4 == 0 ){
                bolunen ++;
                ortalama +=i;
            }
             i++;

        }
        if(bolunen!=0){
            ortalama = ortalama / bolunen;
        }

        System.out.print(sayi + " sayısına kadar olan sayılardan 3e ve 4e tam bölünen sayıların ortalaması : " + ortalama);
        
    }
}
