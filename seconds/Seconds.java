import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(numbersList(myList));
  }

  public static List<Integer> numbersList(List<Integer> numbers) {
    List<Integer> result = new ArrayList();
    for (int i = 0; i < numbers.size(); i++) {
      if (!(i % 2 == 0)) {
        result.add(numbers.get(i));
      }
    }
    return result;
  }
}