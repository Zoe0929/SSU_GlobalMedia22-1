    import java.util.Scanner;

    public class OPP_3_14 {
        public static void main(String[] args) {
            String course[]={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
            int score[]={95,88,76,62, 55};
            String inString="";

            Scanner scanner = new Scanner(System.in);
            while (true){
                int index=-1;
                System.out.print("과목 이름>>");
                inString=scanner.next();
                if(inString.equals("그만")) break;
                for(int i=0;i<course.length;i++){
                    if(inString.equals(course[i])) index=i;
                }
                if(index>-1) System.out.println(course[index]+"의 점수는 "+score[index]);
                else System.out.println("없는 과목입니다. ");

            }
            scanner.close();
        }
    }
