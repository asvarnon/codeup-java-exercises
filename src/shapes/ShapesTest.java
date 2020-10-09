package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle[] rectGroup = new Rectangle[2];

        rectGroup[0] = new Rectangle(5, 4);
        rectGroup[1] = new Square(5);

        for(Rectangle rect : rectGroup){
            System.out.println("rect.getArea() = " + rect.getArea());
            System.out.println("rect.getPerimeter() = " + rect.getPerimeter());
        }

//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());


    }
}
