package model;

import java.util.ArrayList;

public abstract class Phone extends Contact {


    public String name;
    public String color;
    private final int BATTERY_LIFE_TIME = 72;
    private String material;
    public ArrayList<Contact> contacts;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBATTERY_LIFE_TIME() {
        return BATTERY_LIFE_TIME;
    }


    public void Phone(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
        this.contacts = new ArrayList<Contact>();


    }

    public void sendMessage(String number, String text) {

    }

    public void listMessages() {

    }

    public void addContact(String id, String firstName, String lastName, String number) {

    }

    public void listContacts() {

    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public String contact() {
        return null;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

