package dsa;

import java.util.Arrays;
import java.util.Objects;

public class Arraylist implements List {
    private boolean isEmpty = true;
    private int size;

    private String[] arraylist = new String[6];

    public String[] getArraylist() {
        return arraylist;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return isEmpty;
        } else return false;
    }

    @Override
    public int add(String item) {
        arraylist[size] = item;
        size++;
        return capacity();
    }

    @Override
    public void remove(String item) {
        String[] arraylistCopy = new String[arraylist.length];
        for (int index = 0; index < arraylistCopy.length; index++) {
            for (String existingItem : arraylist) {
                if (!Objects.equals(existingItem, item)) {
                    arraylistCopy[index] = existingItem;
                    index++;
                }
            }
        }
        arraylist = arraylistCopy;
        size--;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getIndex(int index) {
        return arraylist[index];
    }

    @Override
    public int capacity() {

        if (arraylist.length == size) {
            String[] arraylistCopy = new String[arraylist.length * 2];
            System.arraycopy(arraylist, 0, arraylistCopy, 0, arraylist.length);
            arraylist = arraylistCopy;
        }
        return arraylist.length;
    }


    @Override
    public boolean contains(String item) {
        for (String anItem : arraylist) {
            if (Objects.equals(anItem, item)) {
                return true;
            }
        }
        return false;
    }

}
