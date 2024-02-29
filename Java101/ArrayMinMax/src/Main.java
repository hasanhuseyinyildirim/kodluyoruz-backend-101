import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan=new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n=scan.nextInt();

        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Dizi :"+Arrays.toString(list));
        Arrays.sort(list);
      
        int min=0,max=0;


        for (int i : list) {
            if (i < n) {
                max = i;
            }
            if (i > n) {
                min = i;
                break;
            }
        }
        
        System.out.println("Girilen sayı : "+n);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + max);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + min);
    }
}
