import java.util.Scanner;

public class OPP10 {
    public static void main(String[] args) {
        int[][] circle = new int[2][3];
        Scanner scanner=new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        for(int i=0;i<circle[0].length;i++){
            circle[0][i]=scanner.nextInt();
        }
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        for(int j=0;j<circle[1].length;j++){
            circle[1][j]=scanner.nextInt();
        }

        double d=distance(circle[0][0],circle[0][1],circle[1][0],circle[1][1]);
        if(circle[0][2]+circle[1][2]<d*d)
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");
    }
    public static double distance(int x1, int y1, int x2, int y2){
        return ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
}

