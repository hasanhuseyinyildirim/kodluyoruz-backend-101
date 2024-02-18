import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input =  new Scanner(System.in);

        String username,password;
        
        System.out.print("Kullanıcı Adını Giriniz : ");
        username =input.nextLine();
        System.out.print("Kullanıcı Şifresini Giriniz : ");
        password =input.nextLine();

        if(username.equals("Hasan") && password.equals("1234")){
            System.out.print("Giriş Yaptınız !");
        } else if(password.equals("1234")){
            System.out.print("Kullanıcı Adınız Yanlış !");
        } else if(username.equals("Hasan")){
            System.out.print("Kullanıcı Şifreniz Yanlış !\nŞifrenizi Sıfırlamak İster Misiniz?\n1.Evet\n2.Hayır\n");
            String onay = input.nextLine();
            
            switch(onay){

                case "1":
                System.out.print("Yeni Kullanıcı Şifresini Giriniz : ");
                password =input.nextLine();

                 if(password.equals("1234")){
                    System.out.print("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                 }else {
                    System.out.print("Şifre oluşturuldu.");
                 }
                break;
                case "2":
                System.out.print("Tekrar Deneyin");
                break;
            }
        }

        
        else {
            System.out.print("Kullanıcı Adınız ve Kullanıcı Şifresiniz Yanlış !");
        }
 }
}
