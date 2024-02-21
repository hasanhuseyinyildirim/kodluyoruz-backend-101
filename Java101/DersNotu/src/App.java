import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, muzik;
        int dersSayisi=0; // kaç dersin ortalamaya katılacağını hesaplamak için kullanılacak

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = input.nextInt();
        if(matematik<=100 && matematik >0){  // eğer ders notu 0 ile 100 arasında değilse ortalamaya alma
            dersSayisi ++;
        } else {
            matematik=0;
        }

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();
        if(fizik<=100 && fizik >0){
            dersSayisi ++;
        } else {
            fizik=0;
        }
        
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya  = input.nextInt();
        if(kimya<=100 && kimya >0){
            dersSayisi ++;
        } else {
            kimya=0;
        
        }


        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();
        if(turkce<=100 && turkce >0){
            dersSayisi ++;
        } else {
            turkce=0;
        }


        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();
        if(muzik<=100 && muzik >0){
            dersSayisi ++;
        } else {
            muzik=0;
        }

        
        double ortalama = (matematik + fizik + kimya + turkce + muzik)/ dersSayisi;
        System.out.println("Not Ortalaması: " + ortalama);

        }


        
    }

