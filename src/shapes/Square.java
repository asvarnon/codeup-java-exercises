package shapes;

public class Square extends Quadrilateral {

    protected double side;
    //constructor
    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getArea(){
        System.out.println("Square method: getArea");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square method: getPerimeter");
        return 4 * this.length;
    }

}
