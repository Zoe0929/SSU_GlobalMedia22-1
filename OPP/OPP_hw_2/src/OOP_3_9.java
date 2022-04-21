public class OOP_3_9 {
    public static void main(String[] args) {
        int[][] numArr=new int[4][4];
        for(int i=0;i<numArr.length;i++){
            for(int j=0;j<numArr[i].length;j++){
                numArr[i][j]=(int)(Math.random()*10+1);
                System.out.print(numArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
