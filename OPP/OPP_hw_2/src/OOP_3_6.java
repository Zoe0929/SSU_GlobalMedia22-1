import java.util.Scanner;

public class OOP_3_6
{
    public static void main(String[] args) {
        int [] uint={50000,10000,1000,500,100,50,10,1};
        int[] count=new int[8];
        System.out.print("금액을 입력하시오.>>");
        Scanner scanner = new Scanner(System.in);
        int money=scanner.nextInt();
        //지폐 세기
        for(int i=0;i<uint.length;i++){
            count[i]=money/uint[i];
            if(count[i]!=0)
                System.out.println(uint[i]+"원 짜리: "+count[i]);
            money%=uint[i];
        }
        scanner.close();
    }
}
