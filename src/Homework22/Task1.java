package Homework22;

import java.util.Stack;
import java.util.Scanner;


public class Task1 {
    //5 3 +
    //10 2 + 2 ^
    //15 7 1 1 + - / 3 * 2 1 1 + + -

    public static double calculate (String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно чисел для оператора " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = performOperation(a, b, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Неизвестный токен: " + token);
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }
        return stack.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    private static double performOperation(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            case "^": return Math.pow(a, b);
            default: throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение в ОПН (числа и операторы через пробел): ");

        String expression = scanner.nextLine();

        try {
            double result = calculate(expression);
            System.out.printf("Результат: %.2f%n", result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}