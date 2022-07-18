package dsa.queue;

public interface Queue {
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
    int queueSize();
}
