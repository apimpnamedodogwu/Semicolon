package dsa;

public interface List {

    boolean isEmpty();

    void add(String item);

    void remove(String item);

    int size();

    String getIndex(int index);


    int capacity();

    boolean contains(String item);
}
