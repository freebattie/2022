package Tasks.step9;

public class Square extends Shape {
    private int side;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public Square(int id, int side,int y,int x) {
        super(id);
        this.side = side;
        this.topLeft = new MovablePoint(y,x);
        this.bottomRight = new MovablePoint(y-side,x+side);
    }

    @Override
    public void area() {
        System.out.println("The Area of the square is " +side*2);
    }

    @Override
    public void circumference() {
        System.out.println("The circumference of the square is " +side*4);
    }

    @Override
    public void moveUp(double distance) {
        topLeft.moveUp(distance);
        bottomRight.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        topLeft.moveDown(distance);
        bottomRight.moveDown(distance);
    }

    @Override
    public void moveLeft(double distance) {
        topLeft.moveLeft(distance);
        bottomRight.moveLeft(distance);

    }

    @Override
    public void moveRight(double distance) {
        topLeft.moveRight(distance);
        bottomRight.moveRight(distance);
    }
    @Override
    public String toString(){
        return  "##############\nSQUARE\nTopleft: \n" + topLeft + "\n"
                +"BottomRight: \n" +bottomRight +"\n##############";

    }
}
