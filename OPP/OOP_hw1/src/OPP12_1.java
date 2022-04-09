import java.util.Scanner;

public class OPP12_1 {
    public static void main(String[] args) {
        System.out.print("연산>>");
        Scanner scanner= new Scanner(System.in);
        double op1 = scanner.nextInt();
        String op = scanner.next();
        double op2 = scanner.nextInt();
        double result=0;
        if(op.equals("+")) result=op1+op2;
        else if(op.equals("-")) result=op1-op2;
        else if(op.equals("*")) result=op1*op2;
        else if(op.equals("/")) {
            if(op1==0 || op2==0) {
                System.out.println("0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }
            result=op1/op2;
        }
        System.out.println(op1+op+op2+"의 계산결과는"+result);
    }
}
