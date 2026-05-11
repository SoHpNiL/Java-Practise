package Design_Patterns;
import java.util.Random;
// This is Adapter

public class CR7 {
public class SpeedReader {
  private static Random random = new Random(1);

  public static void init() {
    random = new Random(1);
  }

  public static double getSpeedMph() {
    return random.nextInt(200);
  }
}
  public interface SpeedControl {
    public double getSpeedKmh();
  }

  class SpeedAdapter implements SpeedControl {
    @Override
    public double getSpeedKmh() {
      double speedMph = SpeedReader.getSpeedMph();
      return speedMph*1.60934;
    } 
  }
}
