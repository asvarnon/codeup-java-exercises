package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable[] myShapes = new Quadrilateral[3];

        myShapes[0] = new Square(5, 5);
        myShapes[1] = new Rectangle(5, 3);
        myShapes[2] = new Parallelogram(10, 8, 9);

        for(Measurable shape : myShapes){
            System.out.println("shape.getArea() = " + shape.getArea());
            System.out.println("shape.getPerimeter() = " + shape.getPerimeter());
        }

    }

}
