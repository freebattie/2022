package Tasks.step9;

public class Circle extends Shape {
    private int radius;
    private MovablePoint point;
    public Circle(int id, int radius,int y,int x) {
        super(id);
        this.radius = radius;
        this.point = new MovablePoint(y,x);
    }


    public Circle(int id, int radius,MovablePoint point) {
        super(id);
        this.radius = radius;
        this.point = point;
    }



    @Override
    public void area() {
        System.out.println("the Area of a circle is " +Math.PI*(radius*radius));
    }

    @Override
    public void circumference() {
        System.out.println("the circumference of a circle is something");
    }

    @Override
    public void moveUp(double distance) {
        point.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        point.moveDown(distance);
    }

    @Override
    public void moveLeft(double distance) {
        point.moveLeft(distance);

    }

    @Override
    public void moveRight(double distance) {
        point.moveRight(distance);
    }
    @Override
    public String toString(){
        return  "##############\nSIRCLE\nPoint:\n"+point.toString()+ "\n##############";

    }
}
