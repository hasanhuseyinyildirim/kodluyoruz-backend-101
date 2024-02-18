import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
    Scanner input = new Scanner(System.in);
 
    double PI = 3.14;
    int r,alpha;

    double daireAlan,daireCevre,dilimAlan;


    System.out.print("Daire diliminin yarıçapını giriniz: ");
    r = input.nextInt();
    
    System.out.print("Daire diliminin merkez açısını giriniz: ");
    alpha = input.nextInt();

        daireAlan = PI*r*r ;
        daireCevre = 2*PI*r ;
        dilimAlan =(PI*(r*r)*alpha)/360 ;
    
        System.out.println("Dairenin Alanı : " + daireAlan);
        System.out.println("Dairenin Çevresi : " + daireCevre);
        System.out.println("Daire Diliminin Alanı : " + dilimAlan);
    }
}
