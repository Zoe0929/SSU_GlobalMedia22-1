public class FinalExample {
    //Field (C++에서는 지역변수)
    public static final double PI_VALUE=3.141;
    //static이 붙으면 static 공간에서 가능.
    //Static Initialization Block

    //Constructor 생성자. 클래스 이름과 같고 리턴 타입이 없음. 여기서 final field 할당 가능.
    public static void main(String[] args){
        final double PI;
        int radius=1;

        PI=3.14; //값할당 필수 . 없으면 컴파일오류.

        double perimeter = 2*PI*radius;
    }
}
