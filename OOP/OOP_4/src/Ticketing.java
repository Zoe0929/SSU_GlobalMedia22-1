import kotlin.reflect.jvm.internal.impl.util.Check;

import java.util.Scanner;

class Seat {
    private  String seat[];

    public Seat(){
        seat= new String[10];
        for(int i =0;i<seat.length; i++){
            seat[i]="---";
        }
    }

    public void Show(){
        for(int i=0;i<seat.length;i++){
            System.out.print(seat[i]+" ");
        }
        System.out.println();
    }

    public void Set(String name, int num){
        seat[num-1] = name;
    }

    public boolean Remove(String name){
        boolean existence = false;
        for(int i = 0;i<seat.length;i++){
            if(name.equals(seat[i])){
                seat[i]="---";
                existence = true;
            }
        }
        return  existence;
    }
}
class Reservation{
    Scanner scanner = new Scanner(System.in);
    private Seat row[];
    private String seatGrade[] = {"S","A","B"};

    public Reservation(){
        row = new Seat[3];
        for(int i = 0; i< row.length; i++){
            row[i] = new Seat();
        }
    }

    public void Reserve(){
        System.out.print("좌석구분 S(1), A(2), B(3) >>");
        int grade = scanner.nextInt();
        System.out.print(seatGrade[grade-1]+">>");
        row[grade-1].Show();

        System.out.print("이름>>");
        String name = scanner.next();
        System.out.print("번호>>");
        int num = scanner.nextInt();
        row[grade-1].Set(name,num);
    }
    public void Search(){
        for (int i =0;i<row.length; i++){
            System.out.print(seatGrade[i]+">>");
            row[i].Show();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void Cancel(){
        System.out.print("좌석 S:1, A:2, B:3>>");
        int grade=scanner.nextInt();
        System.out.print(seatGrade[grade-1]+">>");
        row[grade-1].Show();

        System.out.print("이름>>");
        String name = scanner.next();

        boolean result = row[grade-1].Remove(name);

        if(result){
            System.out.println("취소를 완료했습니다.");
        }
        else{
            System.out.println("존재하지 않는 정보입니다.");
        }

    }

    public void choose(){
        int chice;
        while (true) {
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4 >>");
            chice=scanner.nextInt();

            switch (chice){
                case 1:
                    Reserve();
                    break;
                case 2:
                    Search();
                    break;
                case 3:
                    Cancel();
                    break;
                case 4:
                    System.out.println("----종료합니다----");
                    return;
            }
        }
    }


}

public class Ticketing {
    public static void main(String[] args) {
        Reservation reservation=new Reservation();
        reservation.choose();
    }
}
