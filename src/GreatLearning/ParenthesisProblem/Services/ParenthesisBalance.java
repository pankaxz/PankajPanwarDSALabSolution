package GreatLearning.ParenthesisProblem.Services;

import java.util.Stack;

public class ParenthesisBalance {
    /**
     * Function to check the input string balance.
     *
     * @param expression : input string
     * @return : is the expression balanced.
     */
    public boolean CheckBalance(String expression) {

        // if expression length is odd, then it is not balanced. So we can terminate the function here itself.
        if (expression.length() % 2 == 1){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        //Check for empty stack exception when doing more pop operation than push on stack.
        try {
            for (int i = 0; i < expression.length(); i++) {
                char element = expression.charAt( i );
                //if the input is any of the opening parenthesis, push the input on the stack
                if (element == '{' || element == '(' || element == '[') {
                    stack.push( element );
                }

                //if the input is any of the closing parenthesis, pop an element from the stack and compare it with the input.
                else {
                    char popped = stack.pop();
                    switch ( element ) {
                        case '}' -> { if (popped != '{') { return false; } }
                        case ']' -> { if (popped != '[') { return false; } }
                        case ')' -> { if (popped != '(') { return false; } }
                        default -> throw new IllegalStateException( "Unexpected value: " + element );
                    }
                }
            }
        } catch (Exception e) {
            System.out.println( e + ", more pop operation than push on stack. " );
            System.exit( 0 );
        }

        return stack.isEmpty();
    }
}

