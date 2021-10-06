package ex44;

public class Item {
    public String name;
    double price;
    double quantity;

    public Item(String name, double price, double quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    /*
    system.out.println(name);
    system.out.println(price);
    system.out.println(quantity);
     */

    public void printItem(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.print("Quantity: " + quantity);
    }


}
