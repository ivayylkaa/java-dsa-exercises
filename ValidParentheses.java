import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Deque<Character> pile = new ArrayDeque<>();

        if(s.length()%2!=0) return false;


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                pile.push(c);
            } else {
                if (pile.isEmpty())
                    return false;

                if (c == ')' && pile.peek() == '(') {
                    pile.pop();
                }else if(c == '}' && pile.peek() == '{'){
                    pile.pop();
                }else if(c == ']' && pile.peek() == '['){
                    pile.pop();
                }else {
                    return false;
                }
            }

        }

        return pile.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("")); // true
        System.out.println(isValid("(")); // false
        System.out.println(isValid(")"));
         System.out.println(isValid("))"));
    }
}