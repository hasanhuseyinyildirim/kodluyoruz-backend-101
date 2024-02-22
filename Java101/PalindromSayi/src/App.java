import java.util.Scanner;

public class App {

    static boolean isPalindrom(int number){

        int temp = number , reverseNumber=0,lastNumber;

        while(temp != 0){
            lastNumber = temp%10;
            reverseNumber =(reverseNumber*10)+lastNumber;
            temp /=10;
        }

        boolean result = (reverseNumber==number)?true:false;

        return result;
    }
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
         int number;

        System.out.print("Sayı Giriniz :");
        number =input.nextInt();
        
        String result = (isPalindrom(number)==true)?"Evet":"Hayır";

        System.out.println(number+" sayısı Palindrom bir sayı mıdır?\n"+result);
    }
}
