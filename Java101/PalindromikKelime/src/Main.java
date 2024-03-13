import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.print("Kelime Giriniz : ");
        word =scan.nextLine();
        if(isPalindrome(word)){
            System.out.println(word + " kelimesi palindrome bir kelimedir.");
        }else{
            System.out.println(word + " kelimesi palindrome bir kelime değildir.");
        }

    }
    static boolean isPalindrome(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }
}
}
