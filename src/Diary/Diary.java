package Diary;

import java.util.ArrayList;

public class Diary {
    private String name;
    private boolean isLock;

    private int password;

    ArrayList<Entry> entries = new ArrayList<Entry>();

    public Diary(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean diaryCanLock() {
        return isLock;
    }

    public void dairyLock() {
        isLock = true;
    }

    public void unlock(int password) {
        if (this.password == password) {
            isLock = false;
        }
    }

    public void createEntries(String title, String body) {
        Entry myEntry = new Entry(title, body);
        entries.add(myEntry);
    }


    public int numberOfEntries() {
        return entries.size();
    }

    public int searchByTitle(String title) {
        for (int index = 0; index < entries.size(); index++) {
            Entry anEntry = entries.get(index);
            if (anEntry.getTitle().equals(title)) {
                System.out.println("Entry " + title + "created on " + anEntry.getDateCreated() + "with identity number " + (index + 1));
                return index + 1;
            }
        }
        return 404;
    }

    public String searchById(int idNumber) {

        for (int index = 0; index < entries.size(); index++) {
            if ((idNumber - 1) == index) {
                Entry entry = entries.get(index);
                return entry.getTitle();
            }
        }
        return "Entry does not exist.";
    }

    public void deleteAnEntryByTitle(String title) {
        int idNumber = searchByTitle(title);
        for (int i = 0; i < entries.size(); i++) {
            if ((idNumber - 1) == i) {
                entries.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Diary my = new Diary("eden", 1234);
        my.createEntries("today", "I love you.");
        my.createEntries("today1", "Death is peace.");
        my.createEntries("today2", "I'm tired of being.");
        my.createEntries("today3", "There is a form of comfort that grief brings that hope cannot afford.");

        String name = my.searchById(6);
        System.out.println(name);
        my.deleteAnEntryByTitle("today");
        int no = my.searchByTitle("today");
        System.out.println(no);
    }


}

