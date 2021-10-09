package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class Word implements Comparable {
    public String word;
    public String quantity;

    public Word(String word){
        this.word=word;
        this.quantity="*";
    }
    /*
    this.quantity+="*";
     */
    public void increaseQuantity(){
        this.quantity+="*";
    }
    /*
        return otherlength-this.length
    */
    @Override
    public int compareTo(Object otherWord) {
        int compareQuantity= ((Word)otherWord).quantity.length();
        return compareQuantity - this.quantity.length();
    }
}
