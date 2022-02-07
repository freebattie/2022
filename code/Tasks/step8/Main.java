package Tasks.step8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(9,10);



        HashMap<Integer,Shape> shapes = new HashMap<>();


        Rectangle rec1 = new Rectangle(2,4,3);
        Shape rec2 = new Rectangle(12,4,3);
        Square sq1 = new Square(3,5);
        Square sq2 = new Square(4,15);
        Square sq3 = new Square(5,3);
        Square sq4 = new Square(6,33);
        Square sq5 = new Square(7,30);
        Square sq6 = new Square(8,13);


        shapes.put(rec1.getId(),rec1);
        shapes.put(rec2.getId(),rec2);
        shapes.put(sq1.getId(),sq1);
        shapes.put(sq2.getId(),sq2);
        shapes.put(sq3.getId(),sq3);
        shapes.put(sq4.getId(),sq4);
        shapes.put(sq5.getId(),sq5);
        shapes.put(sq6.getId(),sq6);
        shapes.put(circle1.getId(),circle1);

        for (Map.Entry<Integer, Shape> entry : shapes.entrySet()){
            entry.getValue().area();
            entry.getValue().circumference();
            System.out.println(entry.getValue().getId());
            System.out.println(entry.getKey());;
        }

    }
}
