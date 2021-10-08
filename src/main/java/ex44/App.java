package ex44;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args){
        JsonCollection jc = new JsonCollection();
        boolean chosen=false;
        Scanner sc= new Scanner(System.in);
        while(chosen!=true){
            System.out.println("What is the product name? ");
            String product = sc.nextLine();
            if(containsProduct(jc,product)){
                //print object
                chosen=true;
            }
            else{
                System.out.println("Sorry, that product was not found in our inventory.");
            }

        }
    }
    static boolean containsProduct(JsonCollection jc, String product){
        return true;
    }
}
