package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble(0, 100);
        Circle pokerChip = new Circle(radius);

        System.out.println("pokerChip.getCircumference() = " + pokerChip.getCircumference());
        System.out.println("pokerChip.getArea() = " + pokerChip.getArea());

    }
}
