import java.util.Scanner;

public class Calculator {
    public static void doCalculatorTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два дробных числа и знак операции: + - * /");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String znak = scanner.next();
        scanner.close();

        if(znak.equals("+")) {
            System.out.printf("%.4f", sum(x, y));
        }
        if(znak.equals("-")) {
            System.out.printf("%.4f", subtraction(x, y));
        }
        if(znak.equals("*")) {
            System.out.printf("%.4f", multiplication(x, y));
        }
        if(znak.equals("/")) {
            System.out.printf("%.4f", division(x, y));
        }
    }

    /**
     * Метод сложения двух чисел
     * @param x - Первое введенное число
     * @param y - Второе введенное число
     * @return Сумма двух чисел
     */
    static double sum(double x, double y) {
        return x + y;
    }

    /**
     * Метод вычитания двух чисел
     * @param x - Первое введенное число
     * @param y - Второе введенное число
     * @return Разность двух чисел
     */
    static double subtraction(double x, double y) {
        return x - y;
    }

    /**
     * Метод умножения двух чисел
     * @param x - Первое введенное число
     * @param y - Второе введенное число
     * @return Произведение двух чисел
     */
    static double multiplication(double x, double y) {
        return x * y;
    }

    /**
     * Метод разделения двух чисел
     * @param x - Первое введенное число
     * @param y - Второе введенное число
     * @return Частное двух чисел
     */
    static double division(double x, double y) {
        return x / y;
    }
}
