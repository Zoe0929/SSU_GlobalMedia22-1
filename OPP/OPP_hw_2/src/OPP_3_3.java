import java.util.Scanner;

public class OPP_3_3
{
    public static void main(String[] args) {
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("정수를 입력하시오.>>");
        count=scanner.nextInt();
        for (int i=0;i<count;i++){
            for(int j=0;j<count-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
