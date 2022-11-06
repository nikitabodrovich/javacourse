package day9;

public class Rectangle extends Figure{
    private double width;
    private double height;
    public Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        double s = width*height;
        return s;
    }
    @Override
    public double perimeter(){
        double rectanglePerimeter = 2*width+2*height;
        return rectanglePerimeter;
    }
}
