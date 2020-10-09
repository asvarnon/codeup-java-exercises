package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //getters
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    //setters
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }



}
