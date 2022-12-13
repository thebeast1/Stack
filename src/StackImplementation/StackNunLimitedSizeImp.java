package StackImplementation;

public class StackNunLimitedSizeImp<T> implements StackImp<T> {
    private Node onTop;

    public StackNunLimitedSizeImp() {
        onTop = null;
    }

    private class Node {
        T value;
        Node next;
    }

    @Override
    public void push(T element) {
        ///create the new node
        Node newNode = new Node();

        ///assign the value.
        newNode.value = element;

        /// link the new node with the previous nodes.
        newNode.next = onTop;

        /// change the place of the top pointer.
        onTop = newNode;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty.");
            return null;
        }
        Node topNode = onTop;
        System.out.println("This value will be deleted: " + topNode.value);
        onTop = topNode.next;
        return topNode.value;
    }

    @Override
    public void getTop() {
        if (isEmpty())
            System.out.println("Stack is empty.");
        else
            System.out.println(onTop.value);
    }

    @Override
    public boolean isEmpty() {
        return onTop == null;
    }

    @Override
    public void print() {
        Node printNode = onTop;
        while (printNode != null) {
            System.out.println(printNode.value);
            Node temp = printNode.next;
            printNode = temp;
        }
    }
}