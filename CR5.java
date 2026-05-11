public class CR5 {
  abstract class Shape {

    private String theColour;

    public Shape(String colour) {
      this.theColour = colour;
    }

    public String getColour() {
      return theColour;
    }

    public abstract int getArea();

    public abstract void scale(double factor);

    public boolean hasLargerAreaThan(Shape other) {
      return this.getArea() > other.getArea();
    }
  }

  class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle() {
      super("Black");
      this.width = 1;
      this.height = 1;
    }

    public Rectangle(int width, int height) {
      super("Black");
      this.width = width;
      this.height = height;
    }

    public Rectangle(String colour, int width, int height) {
      super(colour);
      this.width = width;
      this.height = height;
    }

    public int getWidth() {
      return width;
    }

    public int getHeight() {
      return height;
    }

    @Override
    public String toString() {
      return getColour() + " Rectangle (" + width + "x" + height + ")";
    }

    public int getArea() {
      return width * height;
    }

    public void scale(double factor) {
      width = (int) (width * factor);
      height = (int) (height * factor);
    }
  }

  public static void main(String[] args) {
    Shape rec1 = new Rectangle("Blue", 1, 1);
    Shape rec2 = new Rectangle("Green", 2, 2);

    rec1.scale(3);

    System.out.println(rec1.hasLargerAreaThan(rec2));
    System.out.println(rec2.hasLargerAreaThan(rec1));
  }
}
