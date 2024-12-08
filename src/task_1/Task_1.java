package task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите целые числа (введите 'exit' для завершения):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа: " + input);
            }
        }
        scanner.close();

        System.out.println("Четные числа из коллекции:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
