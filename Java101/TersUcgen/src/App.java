import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);

        int number;

        System.out.print("Basamak sayısını giriniz : ");
        number = input.nextInt();

        for(int i=0;i<=number;i++ ){
            int k=2*(number-i)-1;
            while (k>=1){
                System.out.print("*");
                k--;
            }
            System.out.println("");
        }
        
    }
}