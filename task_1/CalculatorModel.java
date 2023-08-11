package seminar_5.task_1;

public class CalculatorModel {

    public double addition(double number1, double number2) {
        return number1 + number2;
    }

    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public double division(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        throw new IllegalArgumentException("Деление на ноль недопустимо!");
    }
}
