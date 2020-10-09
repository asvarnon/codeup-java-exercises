package shapes;

import java.lang.reflect.Array;

public class ShapesTest {

    public static void main(String[] args) {

        Shape[] myShapes = new Shape[4];

        myShapes[0] = new Square(5);
        myShapes[1] = new Rectangle(5, 3);
        myShapes[2] = new Parallelogram(10, 8, 9);
        myShapes[3] = new Circle(5);

        for(Shape shape : myShapes){
            if (shape == Array.get(myShapes, 3)){
                System.out.println("shape.getArea() = " + shape.getArea());
                System.out.println("shape.getCircumference() = " + shape.getCircumference());
                System.out.println(" ");
                return;
            }
            System.out.println("shape.getArea() = " + shape.getArea());
            System.out.println("shape.getPerimeter() = " + shape.getPerimeter());
            System.out.println(" ");
        }

    }

}
