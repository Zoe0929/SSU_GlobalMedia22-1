import java.util.Scanner;

public class PhoneBook {
    Phone phone[];
    int i;
    Scanner scanner = new Scanner(System.in);
    //인원수 입력
    private int InputNum(){
        System.out.print("인원수 >> ");
        int num = scanner.nextInt();
        return num;
    }
    //전화번호부에 저장
    private void getPhoneNum(int num){
        phone = new Phone[num];
        for(i=0; i<phone.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
    }
    //전화번호부 검색
    private  void SearchPhoneBook(int num){
        while (true){
            System.out.print("검색할 이름 >>");
            String name = scanner.next();
            for(i=0; i<num; i++) {
                if(name.equals(phone[i].getName())) {
                    System.out.println(name+"의 번호는 "+phone[i].getTel()+" 입니다.");
                    i--;
                    break;
                }
            }
            if(name.equals("그만")) break;
            if (i == num) System.out.println(name+"이 없습니다.");
        }

    }
    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        int num = phoneBook.InputNum();
        phoneBook.getPhoneNum(num);
        phoneBook.SearchPhoneBook(num);
    }
}

class  Phone{
    String name;
    String tel;
    Phone(String name, String tel){
        this.name=name;
        this.tel=tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
}
