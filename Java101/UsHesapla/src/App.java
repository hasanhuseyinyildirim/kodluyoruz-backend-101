import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input=new Scanner(System.in);

        int sayi,usSayisi,sonuc=1;

        System.out.print("Üssü Alıncak Sayı : ");
        sayi=input.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        usSayisi=input.nextInt();

        if(sayi==0){
            sonuc=0;
        }else if(usSayisi==0){
            sonuc=1;
        }else if(usSayisi==1){
            sonuc=sayi;
        }else{
            for(int i=1;i<=usSayisi;i++){
                sonuc*=sayi;
            }
        }
        
        System.out.print(sayi + " üssü "+ usSayisi + " = " + sonuc );

    }
}
