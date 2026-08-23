import java.util.Scanner;

public class A1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // Allow files to be opened
    String newLine;
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      if (line.endsWith("#")) { // Check if line ends with #
        newLine = line.substring(0, line.length() - 1);
        System.out.println(newLine);
      } else {
        System.out.println(line); // Print out normal line if never had a #
      }
    }
    scan.close();
  }
}
