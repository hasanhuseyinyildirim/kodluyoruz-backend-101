import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);

        int number;

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();


        for(int i=1;i<=number;i++ ){
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            
            for (int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
           
        }

        for(int i=1;i<=number-1;i++ ){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            int k=2*(number-i)-1;
            while (k>=1){
                System.out.print("*");
                k--;
            }
            System.out.println("");
           
        }
        
    }
}
