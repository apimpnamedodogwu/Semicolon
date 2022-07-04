package dsa;

public class Set {
    private ArrayList arrayList = new ArrayList();

    public ArrayList getArrayList() {
        return arrayList;
    }


    public boolean isEmpyty() {
        return arrayList.isEmpty();
    }


    public void add(String item) {
        var result = arrayList.contains(item);
        if (!result) {
            arrayList.add(item);
        }
    }

    public void remove(String item) {
        arrayList.remove(item);
    }

    public String get(int index) {
        return arrayList.getIndex(index);
    }
}
