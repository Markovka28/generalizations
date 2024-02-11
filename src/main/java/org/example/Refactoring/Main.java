package org.example.Refactoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Введите действие (+, -, *, /):");
            String action = scanner.next();

            switch (action) {
                case "+" -> {
                    System.out.println("Введите первое число:");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число:");
                    int b = scanner.nextInt();

                    System.out.println("результат: " + Operations.add(a, b));
                    System.out.println("число в бинарном виде: " + toBinary(a + b));
                }
                case "-" -> {
                    System.out.println("Введите первое число:");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число:");
                    int b = scanner.nextInt();

                    System.out.println("результат: " + Operations.subtract(a, b));
                    System.out.println("число в бинарном виде: " + toBinary(a - b));
                }
                case "*" -> {
                    System.out.println("Введите первое число:");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число:");
                    int b = scanner.nextInt();

                    System.out.println("результат: " + Operations.multiply(a, b));
                    System.out.println("число в бинарном виде: " + toBinary(a * b));
                }
                case "/" -> {
                    System.out.println("Введите первое число:");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число:");
                    int b = scanner.nextInt();

                    System.out.println("результат: " + Operations.divide(a, b));
                    System.out.println("число в бинарном виде: " + toBinary(a / b));
                }
                default -> System.out.println("Неверное действие. Попробуйте еще раз.");
            }
            System.out.println("Хотите продолжить? (y/n)");
            String answer = scanner.next();
            if (!answer.equals("y")) {
                continueProgram = false;
            }
        }
    }

    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
