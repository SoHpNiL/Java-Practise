package Design_Patterns;
// This is Builder 

  public class SoupNoodle {
    public static class NoodleBuilder {

      private NoodleType noodleType;
      private Size size;
      boolean extraNoodle = false;
      boolean extraVeggies = false;
      boolean bambooShoots = false;
      boolean egg = false;

      public NoodleBuilder(NoodleType noodleType, Size size) {
        this.noodleType = noodleType;
        this.size = size;
      }

      public NoodleBuilder addNoodles() {
        this.extraNoodle = true;
        return this;
      }

      public NoodleBuilder addVeggies() {
        this.extraVeggies = true;
        return this;
      }

      public NoodleBuilder addShoots() {
        this.bambooShoots = true;
        return this;
      }

      public NoodleBuilder addEggs() {
        this.egg = true;
        return this;
      }

      public SoupNoodle build() {
        if (noodleType != null || size != null) {
          return new SoupNoodle(this);
        } else {
          throw new IllegalStateException("Must add noodle type and size");
        }
      }
    }

    public enum NoodleType {
      WHEAT_RAMEN,
      RICE_VERMICELLI,
      BUCKWHEAT_SOBA
    }

    public enum Size {
      NORMAL,
      LARGE,
      EXTRA_LARGE
    }

    private final NoodleType noodleType;
    private final Size size;
    private final boolean extraNoodle;
    private final boolean extraVeggies;
    private final boolean bambooShoots;
    private final boolean egg;

    private SoupNoodle(NoodleBuilder builder) {
      this.noodleType = builder.noodleType;
      this.size = builder.size;
      this.extraNoodle = builder.extraNoodle;
      this.extraVeggies = builder.extraVeggies;
      this.bambooShoots = builder.bambooShoots;
      this.egg = builder.egg;
    }

    @Override
    public String toString() {
      return "SoupNoodle [noodleType="
          + noodleType
          + ", size="
          + size
          + ", extraNoodle="
          + extraNoodle
          + ", extraVeggies="
          + extraVeggies
          + ", bambooShoots="
          + bambooShoots
          + ", egg="
          + egg
          + "]";
    }
  }

  