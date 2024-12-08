package task_2.shapes;


public class Circle extends Shape {
    private double radius;

    public Circle(int i) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius;
    }
}
