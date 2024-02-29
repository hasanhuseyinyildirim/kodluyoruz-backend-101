import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
    
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for(int i=0;i<list.length;i++){
            if(!usedNumber(list,i)){ 
                int counter=0;
            for(int j:list){
                if(list[i]==j){
                    counter++;
                }
            }
            System.out.println(list[i]+" Sayısı "+counter+" kere tekrar edildi.");
            }
            
        }
    }
    static boolean usedNumber(int[] arr,int index){ 
        if(index !=0){
            for (int j=0;j<index;j++){
                if(arr[j]==arr[index]){
                    return true;
                }
            }
        }
        return false;
    }
}
/*Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi. */
