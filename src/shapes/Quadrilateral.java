package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;
//    protected double height;

    //constructor
    public Quadrilateral(double length, double width /*, double height */){
        this.length = length;
        this.width = width;
//        this.height = height;
    }

    //getters
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
//    public double getHeight() {
//        return this.height;
//    }

    //setters       abstract
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
//    public abstract void setHeight(double height);
}
