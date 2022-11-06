package day9;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private double radius;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double area(){
        double circleArea = 2*PI*radius;
        return circleArea;
    }
    @Override
    public double perimeter(){
        double circlePerimeter = PI*Math.pow(radius,2);
        return circlePerimeter;
    }
}
