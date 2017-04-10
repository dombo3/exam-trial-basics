import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the orignal list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    System.out.println(numbersList(myList));
  }

  public List<Integer> numbersList(List<Integer> numbers) {
    List<Integer> result = new ArrayList();
    for (int i = 0; i < numbers.size(); i++) {
      if (!(i % 2 == 0)) {
        result.add(numbers.get(i));
      }
    return result;
  }
}