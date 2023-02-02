public class Input {
    private Calculator calculator;

    public Input(Calculator calculator) {
        this.calculator = calculator;
    }
    public void setValues(int a, String operation, int b) {
        calculator.setA(a);
        calculator.setOperation(operation);
        calculator.setB(b);
    }
}
