package shapes;


public class Circle extends CircleType {

    //constructor
    public Circle(double radius){
        super(radius);
        this.radius = radius;
    }

    //setter
    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getters
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea(){
        System.out.println("Circle");
        return Math.PI * Math.pow(this.radius, 2);
    }
    @Override
    public double getCircumference(){
        System.out.println("Circle");
        return 2 * Math.PI * this.radius;
    }
}
