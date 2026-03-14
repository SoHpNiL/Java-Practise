import java.util.ArrayList;

class L2 {

  public static String longestWord(ArrayList<String> words) {

    if (words.isEmpty()){
      return null;
    }

    String Longest = "a";
    for (String Check : words){
      if (Longest.length() < Check.length()){
        Longest = Check;
      }
    }

    return Longest;
  }


  public static void main(String[] args) {
    
    // Test 1
    ArrayList<String> emptyList = new ArrayList<String>();
    String result = longestWord(emptyList);
    System.out.println("Test 1 result: " + result);   // null

    // Test 2
    ArrayList<String> listWithOneWord = new ArrayList<String>();
    listWithOneWord.add("apple");
    result = longestWord(listWithOneWord);
    System.out.println("Test 2 result: " + result);   // apple

    // Test 3
    ArrayList<String> listWithManyWords = new ArrayList<String>();
    listWithManyWords.add("blue");
    listWithManyWords.add("green");
    listWithManyWords.add("red");
    result = longestWord(listWithManyWords);
    System.out.println("Test 3 result: " + result);   // green
    
    // Test 4
    ArrayList<String> listWithTies = new ArrayList<String>();
    listWithTies.add("WhatsApp");
    listWithTies.add("Zoom");
    listWithTies.add("Facebook");
    listWithTies.add("WeChat");
    listWithTies.add("Skype");
    result = longestWord(listWithTies);
    System.out.println("Test 4 result: " + result);  // WhatsApp
    
  }
}