import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println("Sayı tahmini için 5 hakkınız var.");
        while(right < 5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = scan.nextInt();

            if(selected < 0 || selected > 100){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : "+(5-right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if(selected == number ){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı :"+number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz !");
                if(selected > number){
                    System.out.print(selected+" sayısı, gizli sayıdan büyüktür.");
                }else{
                    System.out.print(selected+" sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : "+(5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Doğru sayı : "+number);
            if (!isWrong){
                System.out.println("Tahminleriniz : "+Arrays.toString(wrong));
            }
        }
    }
}
