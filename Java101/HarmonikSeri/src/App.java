import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input =new Scanner(System.in);

        int n;
        double sum=0;

        System.out.print("N Sayısını Giriniz : ");
        n=input.nextInt();

        for(double i=1;i<=n;i++){
            sum += 1/i;
        }
        System.out.println("N Tane Sayının Harmonik Seri Toplamı : "+sum);

    }
}
