package StackImplementation;

public class StackLimitedSizeImp<T> implements StackImp<T> {
    private T[] stack;
    private int top;
    private final int MAXSIZE = 10;

    public StackLimitedSizeImp() {
        top = -1;
        stack = (T[]) new Object[MAXSIZE];
    }

    @Override
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = top; i > -1; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    @Override
    public void push(T element) {
        if (top >= MAXSIZE - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = element;
    }

    @Override
    public T pop() {
        if (top >= 0) {
            T element = stack[top];
            top--;
            return element;
        }
        System.out.println("Stack is already empty.");
        return null;
    }

    @Override
    public void getTop() {
        if (isEmpty())
            System.out.println("Stack is empty.");
        else
            System.out.println(stack[top]);
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}
