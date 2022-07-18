package dsa.queue;

public class QueueImplementation implements Queue {
    private int pushArray[] = new int[5];
    private int removeArray[] = new int[5];
    private int capacity = pushArray.length;
    private int size = -1;

    private int[] reverseArray() {
        int firstArray[] = new int[pushArray.length];
        int secondArray[] = new int[firstArray.length];
        for (int index = 0; index < secondArray.length; index++) {
            secondArray[index] = firstArray[firstArray.length - 1 - index];
        }
        return secondArray;
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException();
        } else pushArray[++size] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            var copiedArray = reverseArray();
            return copiedArray[size--];
        }
        throw new RuntimeException();
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    @Override
    public boolean isFull() {
        return size == capacity - 1;
    }

    @Override
    public int queueSize() {
        return size + 1;
    }
}
