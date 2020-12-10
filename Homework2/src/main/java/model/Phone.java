package model;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class Phone {


    public String name;
    public String color;
    private final int BATTERY_LIFE_TIME = 72;
    private String material;
    public ArrayList<Contact> contacts;
    private String messages;
    public String calls;
    private Message[] allMessages;
    private Call[] allCalls;


    public Phone() {
    }


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



    public ArrayList<Contact> getContacts() {
        return contacts;
    }


    public void addContact(String id, String firstName, String secondName) {
        Contact contact = new Contact(id, firstName, secondName);
        contacts.add(contact);
        System.out.println(contact.toString() + "added");
    }

    public void listOfExistingContacts(){
        for(int i = 0; i < contacts.size(); i++)
            System.out.println(contacts.get(i).toString());
    }

    public void textMessage(String number, String text) {
        Message message = new Message(number, text);
        message.add(message);
        System.out.println(message.toString() + "sent");
    }

    public void listMessages() {
        for(Message message : allMessages)
            System.out.println(message.toString() + "\n");
    }


    public void call(String number) {
        Call call = new Call(number);
        call.add(call);
        System.out.println(call.toString() + " dialing");

    }

    public void callsHistory() {
        for(Call call : allCalls)
            System.out.println(call.toString() + "\n");
    }




}

