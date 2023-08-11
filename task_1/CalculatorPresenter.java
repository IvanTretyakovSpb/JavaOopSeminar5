package seminar_5.task_1;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculation() {
        double num1 = view.getNumberFromUser();
        double num2 = view.getNumberFromUser();
        char kindOperation = view.getOperation();
        double result = 0;

        switch (kindOperation) {
            case '+':
                result = model.addition(num1, num2);
                break;

            case '-':
                result = model.subtraction(num1, num2);
                break;

            case '*':
                result = model.multiplication(num1, num2);
                break;

            case '/':
                result = model.division(num1, num2);
                break;

            default:
                System.out.println("Вид операции введен некорректно!");
        }

        view.displayResult(result);
    }
}
