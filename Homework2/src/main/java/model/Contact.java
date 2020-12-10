package model;

public class Contact {

    private String name;
    private int telephoneNumber;


    public Contact() {

    }

    public Contact(String name, int telephoneNumber) {

        this.name = name;
        this.telephoneNumber = telephoneNumber;

    }

    public Contact(String id, String firstName, String secondName) {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int gettelephoneNumber() {
        return telephoneNumber;
    }

    public void settelephoneNumber(int newtelephoneNumber) {
        telephoneNumber = newtelephoneNumber;
    }

}
