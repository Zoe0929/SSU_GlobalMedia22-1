public class Circle {
    int radius;
    String name;
    public Circle(){

    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle pizza=new Circle();
        pizza.radius=5;
        pizza.name="νΌμ";
        double pizzaArea=pizza.getArea();
        System.out.println(pizzaArea);

        Circle dounut=new Circle();
        dounut.radius=3;
        dounut.name="λλ";
        double dounutArea=dounut.getArea();
        System.out.println(dounutArea);
    }

}
