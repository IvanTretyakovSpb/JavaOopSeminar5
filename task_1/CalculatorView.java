package seminar_5.task_1;

import java.util.Scanner;

public class CalculatorView {
    Scanner scanner = new Scanner(System.in);

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public double getNumberFromUser() {
        System.out.print("Введите число: ");
        return scanner.nextDouble();
    }

    public char getOperation() {
        System.out.print("Укажите вид математической операции (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}
