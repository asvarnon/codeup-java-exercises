package shapes;

public class Square extends Quadrilateral {

    //constructor
    public Square(double length, double width){
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        System.out.println("Square method: getArea");
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square method: getPerimeter");
        return 4 * this.length;
    }
}
