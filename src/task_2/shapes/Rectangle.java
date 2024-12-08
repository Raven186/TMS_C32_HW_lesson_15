package task_2.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной " + width + " и высотой " + height;
    }
}
