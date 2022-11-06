package day9;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c, String color){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area(){
        double halfP = (a+b+c)/2;
        double circleArea = Math. sqrt(halfP*(halfP-a)*(halfP-b)*(halfP-c));
        return circleArea;
    }
    @Override
    public double perimeter(){
        double trianglePerimeter = a+b+c;
        return trianglePerimeter;
    }
}
