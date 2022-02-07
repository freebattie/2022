package Tasks.step9;

public abstract class Shape implements Movable{
    private final int id;


    protected Shape(int id) {

        this.id = id;
    }

    public int getId() {
        return this.id;
     }

    public abstract void area();
    public abstract void circumference();
}
