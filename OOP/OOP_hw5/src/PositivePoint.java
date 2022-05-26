
class Point{
    private int x, y;
    private String out;
    public void move(int x, int  y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class PositivePoint extends Point {
    public PositivePoint(){
        super.move(0,0);
    }

    public PositivePoint(int x, int y){
        if(x>=0 && y>=0){
            super.move(x,y);
        }
        else {
            super.move(0,0);
        }
    }


    @Override
    public void move(int x, int y) {
        if(x>=0 && y>=0){
            super.move(x,y);
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        PositivePoint p=new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");

        p.move(-5,-5);
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2= new PositivePoint(-10,-10);
        System.out.println(p2.toString()+"입니다.");
    }
}
