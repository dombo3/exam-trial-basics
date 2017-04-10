import java.util.*;

public class Pirates{

  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }

    public String getName() {
      return name;
    }

    public boolean isHasWoodenLeg() {
      return hasWoodenLeg;
    }

    public int getGold() {
      return gold;
    }
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold
    System.out.println(getWoodenLegMoreThan15goldPirates(pirates));

  }

  public static List<String> getWoodenLegMoreThan15goldPirates(List<Pirate> pirates) {
    List<String> WoodenLegAndMoreThan15GoldPirate = new ArrayList<>();

    for (Pirate pirate : pirates) {
      if (pirate.isHasWoodenLeg() && (pirate.getGold() > 15)) {
        WoodenLegAndMoreThan15GoldPirate.add(pirate.getName());
      }
    }
    return WoodenLegAndMoreThan15GoldPirate;
  }
}
