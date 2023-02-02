import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    private static StringBuilder stringBuilder = new StringBuilder();
    public static void readFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("data/info.txt"));
            lines.forEach(line -> stringBuilder.append(line + "\n"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static String getText() {
        return stringBuilder.toString();
    }
}
