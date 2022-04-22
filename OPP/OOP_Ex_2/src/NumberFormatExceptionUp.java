import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatExceptionUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divend,divsor;
        while(true) {
            try{
                System.out.print("나눠질 수를 입력>>");
                divend = scanner.nextInt();
                System.out.print("나눌 수를 입력>>");
                divsor = scanner.nextInt();
                System.out.println(divend+" 나누기 "+divsor+"는 "+(divend/divsor)+"입니다.");
                break;
            }
            catch (InputMismatchException e){
                System.out.println("잘못된 입력입니다. 다시 입력하시오.");
                scanner.next();
                continue;
            }
            catch (NumberFormatException e){
                System.out.println("잘못된 입력입니다. 다시 입력하시오.");
            }
            catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하시오.");
            }

        }
    }
}
