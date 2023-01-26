import com.sun.corba.se.spi.orb.Operation;
import operations.Subtraction;

import java.util.Scanner;
import operations.*;

public class Calculator {

    public void calculate() {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Введите второе число");
        double y = scanner.nextDouble();
        System.out.println("Введите знак операции: + - * /");
        String operation = scanner.next();
        Action action;
        double result = 0;
        switch (operation) {
            case "+":
                action = new Addition();
                result = action.invoke(x, y);
                break;
            case "-":
                action = new Subtraction();
                result = action.invoke(x, y);
                break;
            case "*":
                action = new Multiplication();
                result = action.invoke(x, y);
                break;
            case "/":
                action = new Division();
                if (y != 0) {
                    result = action.invoke(x, y);
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
            default:
                System.out.println("Неверно введен знак операции");
        }
        System.out.println(result);
    }
}
