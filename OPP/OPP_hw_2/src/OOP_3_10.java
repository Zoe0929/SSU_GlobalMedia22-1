public class OOP_3_10
{
    public static void main(String[] args) {
        int [][] numArr2d=new int[4][4];
        int randompos1, randompos2, n=0;
        for(int i=0;i<numArr2d.length;i++){
            for(int j=0;j<numArr2d[i].length;j++){
                numArr2d[i][j]=(int)(Math.random()*10+1);
            }
        }
        while (n<6){
            randompos1=(int)(Math.random()*4);
            randompos2=(int)(Math.random()*4);
            if(numArr2d[randompos1][randompos2]!=0) {
                numArr2d[randompos1][randompos2] = 0;
                n++;
            }
        }
        for (int y=0;y<numArr2d.length;y++){
            for(int x=0;x<numArr2d[y].length;x++){
                System.out.print(numArr2d[y][x] + "  ");
            }
            System.out.println();
        }
    }
}
