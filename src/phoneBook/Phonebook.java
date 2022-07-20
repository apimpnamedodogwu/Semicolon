package phoneBook;

import java.util.HashMap;

public class Phonebook {

    HashMap<String, Contact> contacts = new HashMap<>();

    boolean valPhoneNumber(String phoneNumber) {
        return phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8' && phoneNumber.length() == 11;
    }


    int size() {
        return contacts.size();
    }

    void addContact(String phoneNumber, Contact name) {
        if (valPhoneNumber(phoneNumber)) {
            if (contacts.containsKey(phoneNumber)) {
                name.setPhoneNumber(phoneNumber);
                name.setName(name.getName());
                name.setEmail(name.getEmail());
            } else {
                contacts.put(phoneNumber, name);
            }
            return;
        }
        throw new PhonebookException(phoneNumber + " is invalid!");
    }

    void deleteContact(String phoneNumber) {
        if (contacts.containsKey(phoneNumber)) {
            contacts.remove(phoneNumber);
            return;
        }
        throw new PhonebookException(phoneNumber + " does not exist!");
    }

    Contact searchByPhoneNumber(String phoneNumber) {
        if (contacts.containsKey(phoneNumber)) {
            return contacts.get(phoneNumber);
        }
        throw new PhonebookException(phoneNumber + " does not exist!");
    }

    HashMap<String, Contact> getAllContacts() {
        return contacts;
    }
}
