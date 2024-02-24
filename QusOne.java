public class QusOne {
    public static void printNum(int matrix[][]){
              int k=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==7){
                    k++;
                }
            }
        }
        System.out.println(k);

    }
    public static void main (String args[]){
        int matrix[][]={{7,7,8},{7,8,8}};
        printNum(matrix);
    }
}
