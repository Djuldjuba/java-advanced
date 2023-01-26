import java.util.Scanner;
/**
 * @author Noskov Aleksey
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask) {
            case 1:
                Calculator.doCalculatorTask();
                break;
            case 2:
                Array.doArrayTask();
                break;
            default:
                System.out.println("incorrect number");
        }
    }
}
