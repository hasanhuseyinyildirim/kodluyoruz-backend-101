import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("1.Sayıyı Giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2.Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        System.out.print("3.Sayıyı Giriniz : ");
        sayi3 = input.nextInt();

        if(sayi1<sayi2){
            if (sayi2<sayi3){
                System.out.print(sayi1 + "<"+ sayi2 +"<"+sayi3);
            }else{
                 if(sayi1<sayi3){
                    System.out.print(sayi1 + "<"+ sayi3 +"<"+sayi2);
                }else{
                System.out.print(sayi3 + "<"+ sayi1 +"<"+sayi2);
                }
                
            } 
        }else{
            if (sayi1<sayi3){
                System.out.print(sayi2 + "<"+ sayi1 +"<"+sayi3);
            }else{
                if(sayi2<sayi3){
                    System.out.print(sayi2 + "<"+ sayi3 +"<"+sayi1);
                }else{
                System.out.print(sayi3 + "<"+ sayi2 +"<"+sayi1);
                }
            }

        }
    }
}
