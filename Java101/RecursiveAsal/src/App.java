import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        int number;

        System.out.print("Sayı Giriniz : ");
        number=scan.nextInt();
        String message = (isPrime(number,2)==true)?"Asaldır!":"Asal değildir ";
        System.out.println(number +" sayısı "+message);
    }
    public static boolean isPrime(int number, int dividing) {
        if (number < 2) {
            return false;
        }else if(number==dividing){
            return true;
        }
        if (number % dividing == 0) {
            return false;
        }
        return isPrime(number, dividing + 1);
    }
}
