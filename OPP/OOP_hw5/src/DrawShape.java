interface Shape {
    final double PI = 3.14; // 상수
    void draw(); // 도형을 그리는 추상 메소드
    double getArea(); // 도형의 면적을 리턴하는 추상 메소드
    default public void redraw() { // 디폴트 메소드
        System.out.print("--- 다시 그립니다.");
        draw();
    }
}

class Circle implements Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }
    public double getArea() {
        return PI*radius*radius;
    }
}

class Oval implements Shape {
    private int width;
    private int height;
    public Oval(int width, int height) {
        this.width = width;
        this.height=height;
    }
    public void draw() {
        System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return PI*radius*radius;
    }
}

class Rect implements Shape {
    private int width;
    private int height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println(width+"x"+height+"크기의 사각형 입니다.");
    }
    public double getArea() {
        return this.width*this.height;
    }
}

public class DrawShape {
    public static void main(String[] args) {

    }
}
