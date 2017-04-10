public class Box {
  public static void main(String[] args) {
    Cuboid firstCuboid = new Cuboid(2,2,2);

    System.out.println(firstCuboid.getSurface());
    System.out.println(firstCuboid.getVolume());
  }
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
}
