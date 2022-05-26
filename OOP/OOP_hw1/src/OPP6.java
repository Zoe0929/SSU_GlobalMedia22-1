import java.util.Scanner;

public class OPP6 {
    public static void main(String[] args) {
        int num ;
        String game369="박수";
        Scanner scanner=new Scanner(System.in);

        num=scanner.nextInt();

        for(int i=num; i>0; i/=10){
            int temp=num%10;
            if(temp%3==0){
                game369+="짝";
            }
        }

        if(game369=="박수") System.out.println(num);
        else System.out.println(game369);
        scanner.close();
    }
}
