package task03;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    public static void main(String[] args) {
        List<Shape> shapes  = new ArrayList<>();

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);
        
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        System.out.println();

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape + ": " + shape.calculateArea());
        }
        
        System.out.println();
    }

}
