import java.util.Scanner;

public class Array {
    public static void doArrayTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int count = scanner.nextInt();
        String[] array = new String[count];
        System.out.println("Введите произвольные слова: ");
        String longestWord = "";
        for (int i = 0; i < count; i++) {
            String value = scanner.next();
            array[i] = value;
            if (array[i].length() > longestWord.length()) {
                longestWord = array[i];
            }
        }
        System.out.println(longestWord);
    }
}
