import java.util.Scanner;

import javax.xml.transform.Templates;

public class App {
    public static void main(String[] args) throws Exception {

        int N,number;
        Scanner scan=new Scanner(System.in);
        

        System.out.print("N Sayısı : ");
        N=scan.nextInt();
        Minus5(N,N);
    }

    static int Minus5(int N,int original){
        
        System.out.print(N+" ");
        if(N<=0 ){
            return Plus5(N,original);
        }
        N -= 5;     
        return Minus5(N,original);
    }

    static int Plus5(int N,int original){
        if(N==original){
            return 0;
        }
        N +=5;
        System.out.print(N+" ");
        return Plus5(N,original);
    }
}
