import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n= scan.nextInt();

        int[] list=new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i=0;i<list.length;i++){
            System.out.print((i+1) + ". Elemanı : ");
            list[i]= scan.nextInt();
        }

        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for(int i:list){
            System.out.print(i+" ");
        }
        
    }
}

/*Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99 */