package Tasks.step9;

public class Rectangle extends Shape  {
    private int height;
    private int width;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public Rectangle(int id,int height,int width,int y, int x) {
        super(id);
        this.height = height;
        this.width = width;
        this.topLeft = new MovablePoint(y,x);
        this.bottomRight = new MovablePoint(y-height,x+width);
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
        return  "##############\nRECTANGLE\nTopleft: \n" + topLeft + "\n"
                +"BottomRight: \n" +bottomRight +"\n##############";

    }
}
