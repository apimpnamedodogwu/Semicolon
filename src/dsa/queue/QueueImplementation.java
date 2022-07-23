package dsa.queue;

public class QueueImplementation implements Queue {
    private int pushArray[] = new int[5];
    private int capacity = pushArray.length;
    private int top = 0;
    private int rear = -1;
    private int count;

    private int[] reverseArray() {
        int[] secondArray = new int[pushArray.length];
        for (int index = 0; index < secondArray.length; index++) {
            secondArray[index] = pushArray[pushArray.length - 1 - index];
        }
        return secondArray;
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException();
        }
        pushArray[++rear] = element;
        count++;
    }

    @Override
    public int pop() {
        int item;
        if (isEmpty()) {
            throw new RuntimeException();
        }
        item = pushArray[top++];
        count--;
        return item;
    }

    @Override
    public int peek() {
        return pushArray[top];
    }

    @Override
    public boolean isEmpty() {
        return queueSize() == 0;
    }

    @Override
    public boolean isFull() {
        return queueSize() == capacity;
    }

    @Override
    public int queueSize() {
        return count;
    }
}
