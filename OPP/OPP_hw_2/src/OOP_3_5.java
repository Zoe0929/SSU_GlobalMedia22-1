import java.util.Scanner;

public class OOP_3_5
{
    public static void main(String[] args) {
        int[] inputArr= new int[10];
        int[] outArr= new int[10];
        int count=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오.>>");
        for(int i=0;i<10;i++) {
            inputArr[i] = scanner.nextInt();
            if(inputArr[i]%3==0) {
                outArr[count]=inputArr[i];
                count++;
            }
        }
        System.out.print("3의 배수는");
        for (int j=0;j<outArr.length;j++){
            if(outArr[j]==0) break;
            System.out.print(outArr[j]+" ");
        }
    }
}
