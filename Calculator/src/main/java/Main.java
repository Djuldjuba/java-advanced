import java.util.Scanner;
/**
 * @author Noskov Aleksey
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два дробных числа и знак операции: + - * /");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String znak = scanner.next();
        scanner.close();

        if(znak.equals("+")) {
            System.out.printf("%.4f", Operations.sum(x, y));
        }
        if(znak.equals("-")) {
            System.out.printf("%.4f", Operations.subtraction(x, y));
        }
        if(znak.equals("*")) {
            System.out.printf("%.4f", Operations.multiplication(x, y));
        }
        if(znak.equals("/")) {
            System.out.printf("%.4f", Operations.division(x, y));
        }
    }
}
