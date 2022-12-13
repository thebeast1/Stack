import BalancedParentheses.BalancedParentheses;


public class Main {
    public static void main(String[] args) {
        BalancedParentheses balancedParentheses = new BalancedParentheses();
       boolean isBalance = balancedParentheses.isBalancedParentheses("5+(x*5)}");
        System.out.println("is balanced: "+isBalance);
    }
}