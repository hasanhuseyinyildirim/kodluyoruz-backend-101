import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int number,sum=0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        int i=1;
        while(i<number){
            
            if( number % i == 0 ){
                sum += i;
            }
            i++;
        }
        if( number == sum ){
            System.out.print(number+" Mükemmel sayıdır.");
        }else {
            System.out.print(number+" Mükemmel sayı değildir.");
        }
    }
}
