package HomeWork34;

import java.util.Stack;

public class HomeWork34 {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if ( c == '(' || c == '[' || c == '{'){
                characterStack.push(c);
            } else if (c == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') {
                characterStack.pop();
            } else if (c == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                characterStack.pop();
            } else if (c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                characterStack.pop();
            }else {
                return  false;
            }

        }
        return  characterStack.isEmpty();
    }

    public static void main(String[] args) {
        String sequence1 = "([{}])";
        String sequence2 = "(({[!]}))";
        String sequence3 = "(((@)))";

        System.out.println("Sequence 1 is valid: " + isValid(sequence1));
        System.out.println("Sequence 2 is valid: " + isValid(sequence2));
        System.out.println("Sequence 3 is valid: " + isValid(sequence3));
    }
}

