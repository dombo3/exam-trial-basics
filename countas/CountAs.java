import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
    List<String> fileLines = readFile();
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

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("afile.txt");
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Could not read the file!");
    }
    return lines;
  }
}
