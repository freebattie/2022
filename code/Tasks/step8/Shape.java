package Tasks.step8;

public abstract class Shape {
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
