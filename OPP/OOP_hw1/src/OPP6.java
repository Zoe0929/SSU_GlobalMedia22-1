import java.util.Scanner;

public class OPP6 {
    public static void main(String[] args) {
        int num ;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        String game369="박수";
        while(num>0){
            int temp=num%10;
            if(temp%3==0){
                game369+="짝";
            }
            num/=10;
        }
        if(game369=="박수") System.out.println(num);
        else System.out.println(game369);
    }
}
