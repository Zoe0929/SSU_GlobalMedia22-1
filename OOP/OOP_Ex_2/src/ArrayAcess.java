//크기가 5인 배열을 만들어서 5개의 정수를 저장하고 제일 큰 수/ 제일 작은 수를 출력하는 프로그램.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray=new int[5];
        int max=0;
        int min=100;
        for(int i=0;i<intArray.length;i++) {
            try {
                intArray[i] = scanner.nextInt();
                if (max < intArray[i]) max = intArray[i];
                if(min>intArray[i]) min=intArray[i];
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하시오.");
                i--;
                scanner.next();
            }
        }
        System.out.println("배열 내 최대값은 "+max+", 최소값은 "+min);
    }
}
