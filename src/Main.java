import StackImplementation.StackImp;
import StackImplementation.StackNunLimitedSizeImp;

public class Main {

    public static void main(String[] args) {

        StackImp<Double> stack = new StackNunLimitedSizeImp<>();

        stack.push(1.0);
        stack.push(12.0);
        stack.push(58.0);
        stack.push(2.0);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.getTop();

        System.out.println(stack.isEmpty());
    }
}