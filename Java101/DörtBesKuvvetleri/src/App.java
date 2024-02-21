import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Sayı Giriniz :");
        sayi = input.nextInt();
        
        System.out.print("4'ün Kuvvetleri : ");
        for (int i=1;i <= sayi ;i*=4){
            System.out.print(i+" ");
        }
        System.out.println(""); // yeni satıra geçmek için kullanıldı
        System.out.print("5'in Kuvvetleri : ");
        for (int i=1;i <= sayi ;i*=5){
            System.out.print(i+" ");
        }
    }
}
