package Tasks.step8;

public class Circle extends Shape{
    private int radius;

    public Circle(int id, int radius) {
        super(id);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("the Area of a circle is " +Math.PI*(radius*radius));
    }

    @Override
    public void circumference() {
        System.out.println("the circumference of a circle is something");
    }
}
