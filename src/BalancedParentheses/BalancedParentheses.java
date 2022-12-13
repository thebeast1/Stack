package BalancedParentheses;

import StackImplementation.StackImp;
import StackImplementation.StackNunLimitedSizeImp;

public class BalancedParentheses {
    private StackImp<Character> balancedParenthesesStack = new StackNunLimitedSizeImp<>();

    public BalancedParentheses() {
    }

    public boolean isBalancedParentheses(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char element = exp.charAt(i);
            if (isOpenParentheses(element)) {
                balancedParenthesesStack.push(element);
            } else if (isCloseParentheses(element)) {
                if (balancedParenthesesStack.isEmpty())
                    return false;
                char openElement = balancedParenthesesStack.pop();
                if (!checkBalance(openElement, element))
                    return false;
            }
        }
        return balancedParenthesesStack.isEmpty();
    }

    private boolean checkBalance(char openElement, char closeElement) {
        if (isOpenCurlyParentheses(openElement) && isCloseCurlyParentheses(closeElement))
            return true;
        else if (isOpenSquareParentheses(openElement) && isCloseSquareParentheses(closeElement))
            return true;
        else if (isOpenRoundParentheses(openElement) && isCloseRoundParentheses(closeElement))
            return true;
        return false;
    }

    private boolean isOpenCurlyParentheses(char element) {
        return element == '{';
    }

    private boolean isCloseCurlyParentheses(char element) {
        return element == '}';
    }

    private boolean isOpenSquareParentheses(char element) {
        return element == '[';
    }

    private boolean isCloseSquareParentheses(char element) {
        return element == ']';
    }

    private boolean isOpenRoundParentheses(char element) {
        return element == '(';
    }

    private boolean isCloseRoundParentheses(char element) {
        return element == ')';
    }

    private boolean isOpenParentheses(char element) {
        return element == '{' || element == '[' || element == '(';
    }

    private boolean isCloseParentheses(char element) {
        return element == '}' || element == ']' || element == ')';
    }
}
