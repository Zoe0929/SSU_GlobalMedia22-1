import java.util.Scanner;

public class OPP_3_16 {
    public static void main(String[] args) {
        String str[]={"가위","바위","보"};
        String yourStr;
        int comindex;
        Scanner scanner=new Scanner(System.in);

        System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
        while (true){
            System.out.print("가위 바위 보!");
            yourStr=scanner.next();
            if(yourStr.equals("그만")) break;
            comindex=(int)(Math.random()*3);
            if(yourStr.equals(str[comindex])){
                System.out.println("사용자: "+yourStr+" 컴퓨터: "+str[comindex]+", 비겼습니다.");
            }
            else if((yourStr.equals("가위") && str[comindex].equals("보"))
            || (yourStr.equals("바위") && str[comindex].equals("가위"))
            || (yourStr.equals("보") && str[comindex].equals("바위"))){
                System.out.println("사용자: "+yourStr+" 컴퓨터: "+str[comindex]+", 사용자가 이겼습니다.");
            }
            else{
                System.out.println("사용자: "+yourStr+" 컴퓨터: "+str[comindex]+", 컴퓨터가 이겼습니다.");
            }

        }
    }
}
