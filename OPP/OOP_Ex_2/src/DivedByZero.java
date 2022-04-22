import java.util.Scanner;

public class DivedByZero
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int divend, divsor;
        System.out.print("니눠질 수를 입력하시오:");
        divend=scanner.nextInt();
        System.out.print("니눌 수를 입력하시오:");
        divsor=scanner.nextInt();

        System.out.println(divend+"/"+divend+"="+divend/divsor);
    }
}
