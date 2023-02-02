import operations.Subtraction;
import operations.*;

public class Calculator {
    private String operation;
    private int a;
    private int b;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
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
