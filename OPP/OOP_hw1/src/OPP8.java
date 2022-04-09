import java.util.Scanner;

public class OPP8 {
    public static void main(String[] args) {
        int[][] rect = new int[2][2];
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<rect.length;i++){
            for(int j=0;j<rect[i].length;j++){
                rect[i][j]=scanner.nextInt();
            }
        }
        if(inRect(rect[0][0],rect[0][1],100,100,200,200)||inRect(rect[1][0],rect[1][1],100,100,200,200)){
            System.out.println("삼각형이 충돌합니다.");
        }
        else System.out.println("삼각형이 충돌하지 않습니다.");

    }

    public static boolean inRect(int x,int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)){
            return true;
        }
        else return false;

    }
}
