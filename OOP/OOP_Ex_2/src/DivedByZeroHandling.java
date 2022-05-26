import  java.util.Scanner;

public class DivedByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int divend, divsor;
        while (true) {
            System.out.print("니눠질 수를 입력하시오:");
            divend = scanner.nextInt();
            System.out.print("니눌 수를 입력하시오:");
            divsor = scanner.nextInt();
            try {
                System.out.println(divend + "/" + divend + "=" + divend / divsor);
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하시오. ");
            }
        }
        scanner.close();
    }
}
