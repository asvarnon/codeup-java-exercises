package shapes;

public abstract class CircleType extends Shape implements Measurable {
    protected double radius;

    public CircleType(double radius){
        this.radius = radius;
    }

    //getter
    public double getRadius(){
        return this.radius;
    }

    //setter  abstract
    public abstract void setRadius(double radius);

}

