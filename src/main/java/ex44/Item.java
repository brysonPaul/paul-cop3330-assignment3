package ex44;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class Item {
    public String name;
    double price;
    int quantity;

    public Item(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    /*
    system.out.println(name);
    system.out.println(price);
    system.out.println(quantity);
     */

    public void printItem(){//no test, because all the method does is print
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.print("Quantity: " + quantity);
    }


}
