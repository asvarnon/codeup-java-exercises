package shapes;

public class Rectangle extends Quadrilateral {

    //constructor
    public Rectangle(double length, double width){
        super(length, width);
    }

    //getters
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    @Override
    public double getArea(){
        System.out.println("Rectangle");
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getPerimeter(){
        System.out.println("Rectangle");
        return (2 * this.length) + (2 * this.width);
    }

    //setters
    @Override
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }
}
