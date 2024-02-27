public class Circle extends Shape{
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
