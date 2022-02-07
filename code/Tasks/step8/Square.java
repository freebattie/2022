package Tasks.step8;

public class Square extends Shape{
    private int side;

    public Square(int id, int side) {
        super(id);
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("The Area of the square is " +side*2);
    }

    @Override
    public void circumference() {
        System.out.println("The circumference of the square is " +side*4);
    }
}
