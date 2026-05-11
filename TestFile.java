import Design_Patterns.SoupNoodle;

public class TestFile {
    public class Main {
    public static void main(String[] args) {

        // Test 1 - basic order
        SoupNoodle noodle1 = new SoupNoodle.NoodleBuilder(
            SoupNoodle.NoodleType.WHEAT_RAMEN,
            SoupNoodle.Size.NORMAL)
            .build();
        System.out.println("Test 1: " + noodle1);

        // Test 2 - everything added
        SoupNoodle noodle2 = new SoupNoodle.NoodleBuilder(
            SoupNoodle.NoodleType.RICE_VERMICELLI,
            SoupNoodle.Size.LARGE)
            .addEggs()
            .addVeggies()
            .addShoots()
            .addNoodles()
            .build();
        System.out.println("Test 2: " + noodle2);

        // Test 3 - just egg and extra noodles
        SoupNoodle noodle3 = new SoupNoodle.NoodleBuilder(
            SoupNoodle.NoodleType.BUCKWHEAT_SOBA,
            SoupNoodle.Size.EXTRA_LARGE)
            .addEggs()
            .addNoodles()
            .build();
        System.out.println("Test 3: " + noodle3);
    }
}
}
