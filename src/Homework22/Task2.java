package Homework22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Task2 extends JFrame {
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();

    public Task2() {
        setTitle("какулятор");
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 50));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "C", "<", "^", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "+",
                "1", "2", "3", "-",
                "", "0", ".", "=",

        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));

            if (!text.isEmpty()) {
                button.addActionListener(new ButtonListener());
            } else {
                button.setEnabled(false);
                button.setVisible(false);
            }

            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setLocationRelativeTo(null);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();
            switch (command) {
                case "=":
                    calculateResult();
                    break;

                case "C":
                    currentInput.setLength(0);
                    display.setText("");
                    break;

                case "<":
                    if (currentInput.length() > 0) {
                        currentInput.deleteCharAt(currentInput.length() - 1);
                        display.setText(currentInput.toString());
                    }
                    break;

                default:
                    currentInput.append(command);
                    display.setText(currentInput.toString());
                    break;
            }
        }
    }

    private void calculateResult() {
        try {
            String expression = currentInput.toString();

            if (expression.isEmpty()) {
                display.setText("0");
                currentInput.setLength(0);
                currentInput.append("0");
                return;
            }

            double result = evaluateExpression(expression);


            result = Math.round(result * 1e3) / 1e3;

            currentInput.setLength(0);
            currentInput.append(result);
            display.setText(currentInput.toString());

        } catch (Exception ex) {
            display.setText("Ошибка");
            currentInput.setLength(0);
        }
    }

    private double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");
        return parseAddition(expression);
    }

    private double parseAddition(String expr) {
        String[] parts = expr.split("(?=[+-])|(?<=[+-])");

        if (parts.length == 1) {
            return parseMultiplication(expr);
        }

        double result = parseMultiplication(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            double value = parseMultiplication(parts[i + 1]);

            if (operator.equals("+")) {
                result += value;
            } else if (operator.equals("-")) {
                result -= value;
            }
        }

        return result;
    }

    private double parseMultiplication(String expr) {
        String[] parts = expr.split("(?=[*/^])|(?<=[*/^])");

        if (parts.length == 1) {
            return parsePower(expr);
        }

        double result = parsePower(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            double value = parsePower(parts[i + 1]);

            if (operator.equals("*")) {
                result *= value;
            } else if (operator.equals("/")) {
                if (value == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                result /= value;
            } else if (operator.equals("^")) {
                result = Math.pow(result, value);
            }
        }

        return result;
    }

    private double parsePower(String expr) {
        String[] parts = expr.split("\\^", -1);

        if (parts.length == 1) {
            return parseNumber(expr);
        }

        double result = parseNumber(parts[parts.length - 1]);

        for (int i = parts.length - 2; i >= 0; i--) {
            result = Math.pow(parseNumber(parts[i]), result);
        }

        return result;
    }

    private double parseNumber(String expr) {
        try {
            return Double.parseDouble(expr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Некорректное число: " + expr);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Task2().setVisible(true);
        });
    }
}