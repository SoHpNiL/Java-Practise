import java.util.ArrayList;
class CR2 {
 public static void main(String[] args) {

    ArrayList<String> list10 = new ArrayList<String>();
    list10.add("  orange");
    list10.add(" Orange  ");
    list10.add("oRANGE ");
    list10.add("orange  ");
    list10.add("apple");
    int count10 = countOccurrences(list10, " orANge");
    System.out.println("Test Case 10: 'orange' (case insensitive with various spaces) count = " + count10);

    ArrayList<String> list7 = new ArrayList<String>();
    list7.add("pear");
    list7.add("  pear ");
    list7.add("peach");
    int count7 = countOccurrences(list7, "  pear ");
    System.out.println("Test Case 7: 'pear' (with input spaces) count = " + count7);
 }

public static int countOccurrences(ArrayList<String> list, String word) { 
    if (list.isEmpty()){
        return 0;
    }

    int count = 0;
    for (int i = 0; i < list.size(); i++) {
        if (word.trim().equalsIgnoreCase(list.get(i).trim())) {
            count++;
        }
    }

    return count;
}
}
