package shapes;

public class Parallelogram extends Quadrilateral{

    protected double height;
    protected double base;
    protected double side;

    Parallelogram(double length, double width, double side){
        super(length, width);
        this.base = length;
        this.height = width;
        this.side = side;
    }
    //getters
    public double getBase(){
        return this.base;
    }
    public double getHeight(){
        return this.height;
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public double getArea(){
        System.out.println("Parallelogram");
        return this.base * this.height;
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getPerimeter(){
        System.out.println("Parallelogram");
        return (2 * this.base) + (2 * this.side);
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
