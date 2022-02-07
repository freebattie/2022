package Tasks.step8;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int id,int height,int width) {
        super(id);
        this.height = height;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("the Area of the rectangle is: "+height*width);
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void circumference() {
        System.out.println("the circumference of the rectangle is: "+(height*2) + (width*2));
    }
}
