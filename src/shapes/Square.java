package shapes;

public class Square extends Rectangle {

    protected double side;
    //constructor
    public Square(double side){
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea(){
        System.out.println("Square method: getArea");
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Square method: getPerimeter");
        return 4 * this.side;
    }
}
