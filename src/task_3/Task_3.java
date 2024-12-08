package task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер коллекции:");
        int size = 0;
        while (true) {
            try {
                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Размер коллекции должен быть положительным числом.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите валидное целое число.");
            }
        }

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100)); // Генерируем числа от 0 до 99
        }

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Коллекция чисел: " + numbers);
        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
};

