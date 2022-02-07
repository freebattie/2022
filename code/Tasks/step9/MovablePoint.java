package Tasks.step9;

public class MovablePoint implements Movable{
    private double y;
    private double x;


    public MovablePoint(double y, double x) {
        this.y = y;
        this.x = x;

    }

    @Override
    public void moveUp(double distance) {
        this.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.y -= distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.x -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.x += distance;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("y: ");
        sb.append(this.y);
        sb.append("\n");
        sb.append("x: ");
        sb.append(this.x);
        return sb.toString();
    }
}
