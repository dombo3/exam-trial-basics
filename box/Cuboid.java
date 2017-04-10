public class Cuboid {
  private int x;
  private int y;
  private int z;

  public Cuboid(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getSurface() {
    int surface = 2*x*y + 2*x*z + 2*y*z;
    return surface;
  }

  public int getVolume() {
    int volume = x*y*z;
    return volume;
  }
}
