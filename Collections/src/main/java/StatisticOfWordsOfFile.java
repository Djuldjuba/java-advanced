import java.util.*;

public class StatisticOfWordsOfFile {
    static Map<String, Integer> wordsList = new TreeMap<>();
    public static void getStatistic() {

        String text = ReadFile.getText();
        String[] words = text.split(" ");
        for (String word : words) {
            if (!wordsList.containsKey(word)) {
                wordsList.put(word, 1);
            } else wordsList.put(word, wordsList.get(word) + 1);
        }

        String key;
        int value = 0;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value > maxCount) {
                maxCount = value;
            }
            System.out.println(String.format("|%s|%d|", key, value));
        }

        for (Map.Entry<String, Integer> entry : wordsList.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (value == maxCount)
                System.out.println(String.format("\nСлово '%s' встречается в файле %d раз(а)", key, value));
        }
    }
}
