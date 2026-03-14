import java.util.ArrayList;

class L3 {

  public static int countKeywords(String keywords) {
    if (keywords.isEmpty()){
        return 0;
    }

    int Length = 0;
    String[] List = keywords.split(";");
    ArrayList <String> words = new ArrayList<String>();

    for (int i = 0; i < List.length; i++){
        words.add(List[i].trim());
    }


    for (int i = 0; i < words.size(); i++){
        if (!words.get(i).isEmpty()){
            Length++;
        }
    }


    return Length;
  }

  public static void main(String[] args) {
    
    // Test 1
    String test1 = "";
    int result = countKeywords(test1);
    System.out.println("Test 1 result: " + result);   // expect 0

    // Test 2
    String test2 = "fruit; vegetables; drinks";
    result = countKeywords(test2);
    System.out.println("Test 2 result: " + result);   // expect 3

    // Test 3
    String test3 = "flat white; latte; cappuccino; cafe au lait; mocha";
    result = countKeywords(test3);
    System.out.println("Test 3 result: " + result);   // expect 5

    // Test 4
    String test4 = "oolong; ; herbal;  ;;    ; matcha";
    result = countKeywords(test4);
    System.out.println("Test 4 result: " + result);   // expect 3

    // Test 5
    String test5 = ";hoki;;h//;;; ;   ; ; ;i;;";
    result = countKeywords(test5);
    System.out.println("Test 5 result: " + result);   // expect 3
    
  }
}