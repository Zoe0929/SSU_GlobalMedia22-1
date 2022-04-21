import java.util.Scanner;

public class OOP_3_4 {
    public static void main(String[] args) {
        System.out.print("소문자 알파벡 하나를 입력하시오.>>");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c=s.charAt(0);
        for(int i=0;i<c-'a'+1;i++){
            for(int j=0;j<c-'a'-i+1;j++){
                char outChar =(char)('a' + j);
                System.out.print(outChar);
            }
            System.out.println();
        }
        scanner.close();
    }
}
