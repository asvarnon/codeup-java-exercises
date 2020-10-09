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
        return this.length * this.width;
    }
    @Override
    public double getPerimeter(){
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
