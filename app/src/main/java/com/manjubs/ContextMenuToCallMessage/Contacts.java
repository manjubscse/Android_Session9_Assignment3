package com.manjubs.ContextMenuToCallMessage;

/**
 * Created by manju.
 */

public class Contacts {

    // Contact Name and Phone Number
    private String contactName;
    private String phoneNumber;

    // Contacts Class Constructor
    public Contacts(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter Methods

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
