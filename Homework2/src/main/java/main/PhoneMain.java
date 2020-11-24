package main;

import model.HuaweiP30;
import model.HuaweiP40;
import model.SamsungS10;
import model.SamsungS9;

public class PhoneMain {


    public static void main(String... args){

        SamsungS9 phone1 = new SamsungS9("black", "metal");
        SamsungS10 phone2 = new SamsungS10("blue", "aluminium");
        HuaweiP30 phone3 = new HuaweiP30( "red", "aluminium");
        HuaweiP40 phone4 = new HuaweiP40("white", "metal");

        System.out.println(phone1.getName());
        System.out.println(phone2.getColor());
        System.out.println(phone3.getMaterial());
        System.out.println(phone4.contact());
}};
