import java.util.Deque;
import java.util.ArrayDeque;



public class Stacks {
    String someFunction = "((HELLO))";
         
    Deque<String> stack = new ArrayDeque<>();

    for (int i = 0; i < someFunction.size(); i++){
        stack.push(someFunction.substring(i));

    }
}
