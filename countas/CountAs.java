import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    
    Path filePath = Paths.get("not-a-file.txt");
    List<String> fileLines = readFile(filePath);
    List<char[]> charArrayList = getCharLists(fileLines);
    countChar(charArrayList, 'a');
  }

  public static void countChar(List<char[]> charArrayList, char c) {
    int counter = 0;
    for (int i = 0; i < charArrayList.size(); i++) {
      for (char character : charArrayList.get(i)) {
        if (c == character) {
          counter++;
        }
      }
    }
    System.out.println(counter);
  }

  public static List<char[]> getCharLists(List<String> fileLines) {
    List<char[]> charArrayList = new ArrayList<>();
    for (int i = 0; i < fileLines.size(); i++) {
      char[] charArray = fileLines.get(i).toCharArray();
      charArrayList.add(charArray);
    }
    return charArrayList;
  }

  public static List<String> readFile(Path filePath) {
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      return lines;
    }
    return lines;
  }
}
