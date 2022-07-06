package dsa;

public class Set {

    private Arraylist arraylist = new Arraylist();

    public Arraylist getArraylist() {
        return arraylist;
    }


    public boolean isEmpyty() {
        return arraylist.isEmpty();
    }


    public void add(String item) {
        var result = arraylist.contains(item);
        if (!result) {
            arraylist.add(item);
        }
    }

    public void remove(String item) {
        arraylist.remove(item);
    }

    public String get(int index) {
        return arraylist.getIndex(index);
    }
}
