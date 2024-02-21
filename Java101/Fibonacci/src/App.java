import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Eleman Sayısını Giriniz : ");
        number = input.nextInt();

        System.out.print(number+" Elemanlı Fibonacci Serisi : 0 1 ");
        switch(number){
                case 1:
                break;

                default:

             int sayi1=0,sayi2=1,result=1;
             int i=1;

             while(i<number){
                result=sayi1+sayi2;
                System.out.print(result+" ");
                sayi1=sayi2;
                sayi2=result;
                i++;
            }

        }
            
        
    }
}
