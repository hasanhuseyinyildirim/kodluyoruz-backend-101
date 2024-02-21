public class App {
    public static void main(String[] args) throws Exception {
        
        int counter=0;

        for(int i=2;i<=100;i++){
            for(int j=1;j<=i;j++){
                if( i % j == 0 ){
                    counter +=1;
                   
                }
            }
            if(counter == 2){ 
                System.out.print(i+" ");
            }
            counter =0;
           
        }

    }
}
