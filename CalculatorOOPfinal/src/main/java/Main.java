public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Input input = new Input(calculator);
        input.setValues(1, "+", 5);
        Result.getResultToConsole(calculator.getInstance().invoke());
    }
}
