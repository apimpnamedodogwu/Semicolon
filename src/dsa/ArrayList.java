package dsa;

import java.util.Objects;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size;
    private String[] elements = new String[5];

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(String item) {
        elements[size++] = item;
    }

    @Override
    public void remove(String item) {
        String[] newElement = new String[elements.length];
        for (int index = 0; index < newElement.length; index++) {
            for (String value : elements) {
                if (!Objects.equals(value, item)) {
                    newElement[index] = value;
                    index++;
                }

            }
        }
        elements = newElement;
        --size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getIndex(int index) {
        return elements[index];
    }

    @Override
    public int capacity() {
        if (elements.length == size) {
            String[] newArray = new String[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        return elements.length;
    }

    @Override
    public boolean contains(String item) {
        for (String anItem : elements) {
            if (Objects.equals(item, anItem)) {
                return true;
            }
        }
        return false;
    }
}
