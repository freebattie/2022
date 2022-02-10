package Tasks.step9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(2,3);
         // oppgave 1 og 2
        System.out.println(point1);
        point1.moveDown(2);
        System.out.println(point1);

        //Oppagve 3
        Circle sirkel1 = new Circle(1,3,4,5);
        Circle sirkel2 = new Circle(1,3,new MovablePoint(2,3));






        //oppgave 4

        Square sqr = new Square(2,3, 1,1);
        Shape req = new Rectangle(3,4,6,3,3);

        System.out.println(sqr);
        System.out.println(sirkel1);
        System.out.println(req);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(sqr);
        shapes.add(sirkel1);
        shapes.add(req);

       shapes.get(0).moveDown(4);
       shapes.get(1).moveUp(10);
       shapes.get(2).moveRight(6);

       for (var shap : shapes){
           System.out.println(shap);
       }

    }
}
