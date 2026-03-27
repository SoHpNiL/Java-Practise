public class TestFile {
	public static void main(String[] args) {
		Bottle bottle = new Bottle(1000);

		System.out.println(bottle.getCurrentLiquidAmount()); // Ensure getCurrentLiquidAmount() returns a value, not void
		System.out.println(bottle.getCapacity());


        Bottle bottle1 = new Bottle(1000);
Bottle bottle2 = new Bottle(1000);

bottle1.fill(1000);
bottle2.fill(1);

System.out.println(bottle1.getCurrentLiquidAmount());
System.out.println(bottle2.getCurrentLiquidAmount());

bottle2.pourInto(bottle1);

System.out.println(bottle1.getCurrentLiquidAmount());
System.out.println(bottle2.getCurrentLiquidAmount());
	}
}
