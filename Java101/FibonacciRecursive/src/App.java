import java.util.Scanner;

public class App {

    static int fib(int n){

        if (n==1 || n==2){
            return 1;
        } 
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Sayı Giriniz : ");
        number=input.nextInt();

        for (int i=1;i<=number;i++){
            System.out.print(fib(i)+" ");
        }

 
    }
}
