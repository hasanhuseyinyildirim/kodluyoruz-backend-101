public class Main {
    public static void main(String[] args) throws Exception {

        int[][] matrixA={
            {2,3,4},
            {5,6,4}
        };
        int[][] transpozeA=new int[matrixA[0].length][matrixA.length];

         System.out.println("Matris : ");
         for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixA[i].length;j++){
                     transpozeA[j][i]=matrixA[i][j];
                    System.out.print(matrixA[i][j]+"\t");
            }
            System.out.println();
         }
         System.out.println("Transpoze : ");
         for(int i=0;i<transpozeA.length;i++){
            for(int j=0;j<transpozeA[i].length;j++){
                System.out.print(transpozeA[i][j]+"\t");
            }
            System.out.println();
         }

    }
}
