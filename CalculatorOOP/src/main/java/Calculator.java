import operations.Subtraction;
import operations.*;

public class Calculator {
    private String operation;
    private int a;
    private int b;

    public Calculator(int a, String operation, int b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public Action getInstance() throws ArithmeticException {
            switch (operation) {
                case "+":
                    return new Addition(a, b);
                case "-":
                    return new Subtraction(a, b);
                case "*":
                    return new Multiplication(a, b);
                case "/":
                    return new Division(a, b);
                default:
                    return null;
            }
    }
}
