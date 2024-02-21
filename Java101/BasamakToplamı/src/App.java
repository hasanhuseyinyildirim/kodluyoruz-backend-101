import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int number,sum=0;
    



        System.out.print("Sayıyı Giriniz : ");
        number = input.nextInt();
        int numb=number;
        while(number != 0){

            sum+= number%10;
            number /= 10;
        }
        System.out.print(numb+" sayısının basamak değerleri toplamı : "+sum);
    }
}
