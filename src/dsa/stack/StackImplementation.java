package dsa.stack;

public class StackImplementation implements StackForEden {

    private int array[] = new int[5];
    private int top = -1;
    private int capacity = array.length;



    @Override
    public boolean isEmpty() {
        return top == -1;
    }


    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void push(int toBePushed) {
        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        } else array[++top] = toBePushed;

    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty stack cannot be popped!");
        } else return array[top--];
    }

    @Override
    public int peek() {
        return array[top];
    }
}
