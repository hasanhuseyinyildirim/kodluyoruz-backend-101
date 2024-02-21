import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
 Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
         */

        Scanner input =new Scanner(System.in);

        int gun,ay;


        System.out.print("Doğdunuz Ayı Giriniz : ");
        ay = input.nextInt();

        System.out.print("Doğdunuz Günü Giriniz : ");
        gun = input.nextInt();

        if(ay==1){
            if(gun>=22){
                System.out.print("Burcunuz Kova");
            }else{
                System.out.print("Burcunuz Oğlak");
            }

        }else if(ay==2){
            if(gun>=20){
                System.out.print("Burcunuz Balık");
            }else{
                System.out.print("Burcunuz Kova");
            }

        }else if(ay==3){
            if(gun>=21){
                System.out.print("Burcunuz Koç");
            }else{
                System.out.print("Burcunuz Balık");
            }

        }else if(ay==4){
            if(gun>=21){
                System.out.print("Burcunuz Boğa");
            }else{
                System.out.print("Burcunuz Koç");
            }

        }else if(ay==5){
            if(gun>=22){
                System.out.print("Burcunuz İkizler");
            }else{
                System.out.print("Burcunuz Boğa");
            }

        }else if(ay==6){
            if(gun>=23){
                System.out.print("Burcunuz Yengeç");
            }else{
                System.out.print("Burcunuz İkizler");
            }

        }else if(ay==7){
            if(gun>=23){
                System.out.print("Burcunuz Aslan");
            }else{
                System.out.print("Burcunuz Yengeç");
            }

        }else if(ay==8){
            if(gun>=23){
                System.out.print("Burcunuz Başak");
            }else{
                System.out.print("Burcunuz Aslan");
            }

        }else if(ay==9){
            if(gun>=23){
                System.out.print("Burcunuz Terazi");
            }else{
                System.out.print("Burcunuz Başak");
            }


        }else if(ay==10){
            if(gun>=23){
                System.out.print("Burcunuz Akrep");
            }else{
                System.out.print("Burcunuz Terazi");
            }

        }else if(ay==11){
            if(gun>=22){
                System.out.print("Burcunuz Yay");
            }else{
                System.out.print("Burcunuz Akrep");
            }

        }else if(ay==12){
            if(gun>=22){
                System.out.print("Burcunuz Oğlak");
            }else{
                System.out.print("Burcunuz Yay");
            }

        }




    }
}
