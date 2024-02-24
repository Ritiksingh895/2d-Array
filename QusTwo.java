public class QusTwo {
    public static void printSum(int array[][]){
        int sum=0;
       // for(int i=1;i<array.length-1;i++){
            for(int j=0;j<array[0].length;j++){
                sum+=array[1][j];
            }
        System.out.println(sum);
    }
    
    public static void main(String args[]){
        int array[][]={{1,4,9},{11,4,3},{2,2,3}};
        printSum( array);
    }
}
