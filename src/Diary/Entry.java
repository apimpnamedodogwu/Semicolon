package Diary;

import java.util.ArrayList;
import java.util.Calendar;

public class Entry {
    private int identityNumber;
    private String title;
    private String body;
    Calendar dateCreated;



    public Entry( String title, String body) {

        if(body.isEmpty()) {
            throw new IllegalArgumentException("This body cannot be empty.");
        }

        if(title.isEmpty()) {
            throw new IllegalArgumentException("This title cannot be empty.");
        }

        identityNumber++;
        this.title = title;
        this.body = body;
        this.dateCreated = Calendar.getInstance();
    }

    public int getIdentityNumber() {
        return identityNumber;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Calendar getDateCreated() {
        return Calendar.getInstance();
    }

}
