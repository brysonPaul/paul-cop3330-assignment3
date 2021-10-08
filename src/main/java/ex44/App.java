package ex44;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */

/*
jc= new JsonCollection
sc= new Scanner(System.in)
while item not chosen
    s = strIO(what is the name of the item?,sc)// a way to ask for user input and collect response
    index = checkIfItemContained(jc,products)
    if(index == -1)
        print item
    else
        println("Item not found, try again")
    end if
end loop
 */
public class App {
    public static void main(String[] args){
        JsonCollection jc = new JsonCollection();
        boolean chosen=false;
        Scanner sc= new Scanner(System.in);
        while(chosen!=true){
            System.out.print("What is the product name? ");
            String product = sc.nextLine();
            int index=containsProduct(jc,product);
            if(index!=-1){
                jc.p.products.get(index).printItem();
                chosen=true;
            }
            else{
                System.out.println("Sorry, that product was not found in our inventory.");
            }

        }
    }
    /*
        for(x=0;x<products.size; x++)
            if(product== product.get(x))
                return x
            end if
         end loop
     */
    static int containsProduct(JsonCollection jc, String product)
    {
        for(int x=0;x<jc.p.products.size();x++){
            if(product.equalsIgnoreCase(jc.p.products.get(x).name)){
                return x;
            }
        }
        return -1;
    }
}
