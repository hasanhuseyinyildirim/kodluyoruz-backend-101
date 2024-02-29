import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] list={3,7,8,9,4,8,7,5,3,1,4,1,1,12,4,2,2,15,12,6};
        int[] dublicate=new int[list.length];
        int startIndex=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i!=j) && (list[i]==list[j])){
                    if(!(isFind(dublicate,list[i]))){
                        if(list[i]%2==0){
                            dublicate[startIndex++]=list[i];
                        }
                    }
                    break;
                }
            }
        }
        for(int value:dublicate){
            if(value!=0){
                System.out.print(value + " ");
            }
        }
    }

     static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i==value){
                return true;
            }
        }
        return false;
     }
}
