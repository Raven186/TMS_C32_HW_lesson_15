package task_2;

import task_2.shapes.Shape;
import task_2.shapes.Rectangle;
import task_2.shapes.Circle;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        // Создаем коллекцию фигур
        List<task_2.shapes.Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(7));

        // Обрабатываем фигуры
        System.out.println("Периметры фигур:");
        for (Shape shape : shapes) {
            System.out.println(shape + " имеет периметр " + shape.calculatePerimeter());
        }
    }
}
