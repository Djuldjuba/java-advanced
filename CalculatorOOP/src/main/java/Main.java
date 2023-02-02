public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, "/", 0);
        Result.getResultToConsole(calculator.getInstance().invoke());
    }
}
