import java.util.Scanner;

public class EX_2_4 {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오");
        Scanner scanner = new Scanner(System.in);

        String name=scanner.next();
        System.out.print("아름은 "+name+" ");

        String city=scanner.next();
        System.out.print("도시는 "+city+" ");

        int age=scanner.nextInt();
        System.out.print("나이는 "+age+" ");

        double weight=scanner.nextDouble();
        System.out.print("체중은 "+weight+" ");

        boolean single=scanner.nextBoolean();
        System.out.print("독신 여부눈 "+single+"입니다.");

        scanner.close();

    }
}
