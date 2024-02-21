import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int number1,number2;
        int ebob=1,ekok=1;

        System.out.print("1.Sayıyı Giriniz : ");
        number1=input.nextInt();

        System.out.print("2.Sayıyı Giriniz : ");
        number2=input.nextInt();

        int i=1;


        while (i<=number1){
            if( number1 % i == 0 && number2 % i == 0){
                ebob =i;
                ekok =(number1*number2)/ebob;
                
            }
            i++;
        }
        System.out.print(number1+" ile "+number2 +" sayısının ebobu : "+ebob+" ekoku : "+ekok);
    
    
    }
}
