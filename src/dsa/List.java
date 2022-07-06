package dsa;

public interface List {

    boolean isEmpty();

    int add(String item);

    void remove(String item);

    int size();

    String getIndex(int index);

    int capacity();

    boolean contains(String item);


}
