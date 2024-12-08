package task_4;

import java.util.HashSet;
import java.util.Set;

public class Task_4 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Иван Иванов");
        names.add("Петр Петров");
        names.add("Мария Смирнова");
        names.add("Елена Соколова");
        names.add("Алексей Попов");
        names.add("Виктория Кузнецова");

        System.out.println("Уникальные имена:");
        names.forEach(System.out::println);
    }
}
