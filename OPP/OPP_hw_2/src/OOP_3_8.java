import java.util.Scanner;

public class OOP_3_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num= scanner.nextInt();
        int[] numArr=new int[num];

        for(int i=0;i<num;i++){
            numArr[i]=(int)(Math.random()*100+1);
            for(int j=0;j<i;j++){   //유일한지 탐색
                if(numArr[j]==numArr[i]) {
                    i--;
                    break;
                }
            }}
        for(int k=0;k<num;k++){
            System.out.print(numArr[k]+" ");
            if((k+1)%10==0) System.out.println();
        }

    }
}
