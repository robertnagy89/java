public class Triangle extends Shape{
    private double a;
    private double ma;

    public Triangle(double a, double ma){
        this.a = a;
        this.ma = ma;
    }

    @Override
    public double calculateArea() {
        return (a*ma)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", ma=" + ma +
                '}';
    }
}
