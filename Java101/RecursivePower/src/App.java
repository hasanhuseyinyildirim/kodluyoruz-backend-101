import java.util.Scanner;

public class App {

   
    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        int number,powNumber;
        
        System.out.print("Taban değeri giriniz :");
        number=scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        powNumber=scan.nextInt();

        int result = power(number,powNumber);
        System.out.println("Sonuc :"+result);
    }

    static int power(int number,int powNumber ){
        if(powNumber==0){
            return 1;
        }else{
            return number*power(number, powNumber-1);
        }

    }
}

