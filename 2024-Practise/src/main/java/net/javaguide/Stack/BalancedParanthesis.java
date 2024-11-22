package net.javaguide.Stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
     //   String input = "{[()]}";
       // String input = "(){}[]";
        String input = "([{])}";
        System.out.println("Is Balanced " + isBalanced(input));
    }

    
}
