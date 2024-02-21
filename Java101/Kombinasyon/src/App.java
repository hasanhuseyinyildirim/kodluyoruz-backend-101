import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int n,r;
        long nFaktoriyel=1,rFaktoriyel=1,n_rFaktoriyel=1,total;

        System.out.print("C(n,r) ,n sayısını girin: ");
        n = input.nextInt();

        System.out.print("C(n,r) ,r sayısını girin: ");
        r = input.nextInt();


        for(int i=1;i<=n;i++){
            nFaktoriyel=nFaktoriyel*i;
        }
        for(int i=1;i<=r;i++){
            rFaktoriyel=rFaktoriyel*i;
        }
        for(int i=1;i<=(n-r);i++){
            n_rFaktoriyel=n_rFaktoriyel*i;
        }
        total = (nFaktoriyel)/(rFaktoriyel*(n_rFaktoriyel));
        System.out.print("C("+n+","+r+") = "+total);
    }
}



/*   n!=1*2*3*4*5.....   
     C(n,r) = n! / (r! * (n-r)!) */
