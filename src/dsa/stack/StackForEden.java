package dsa.stack;

public interface StackForEden {
    boolean isEmpty();

    boolean isFull();

    void push(int toBePushed);

    int pop();

    int size();

    int peek();
}
