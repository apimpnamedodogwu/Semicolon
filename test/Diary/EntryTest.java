package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry myEntry;

    @BeforeEach
    void SetUp() {
        myEntry = new Entry("Title", "Body");
    }


    @Test
    void TestThatAllFieldsCanBeCreated() {


    }

    @Test
    void TestValidation() {
        assertThrows(IllegalArgumentException.class,
                ()-> new Entry("Title","" ));

        assertThrows(IllegalArgumentException.class,
                ()-> new Entry("", "Body"));
    }


    @Test
    void getIdentityNumber() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
        myEntry.setTitle("Title");
        String result = myEntry.getTitle();
        assertEquals("Title", result);
    }

    @Test
    void getBody() {
    }

    @Test
    void setBody() {
    }

    @Test
    void getDateCreated() {
    }
}