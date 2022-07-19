package phoneBook;

import java.util.HashMap;

public class Phonebook {

    HashMap<String, String> contacts = new HashMap<>();

    boolean valPhoneNumber(String phoneNumber) {
        return phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8' && phoneNumber.length() == 11 && phoneNumber.matches("[0 - 9]+");
    }

    int size() {
        return contacts.size();
    }

    void addContact(String phoneNumber, String email) {
        if (valPhoneNumber(phoneNumber)) {
            if (contacts.containsKey(phoneNumber)) {
                throw new PhonebookException(phoneNumber + " already exists! Input another!");
            } else {
                contacts.put(email, phoneNumber);
                return;
            }
        }
        throw new PhonebookException(phoneNumber + " is invalid!");

    }


}
