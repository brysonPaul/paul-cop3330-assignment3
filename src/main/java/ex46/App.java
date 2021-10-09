package ex46;

import java.util.ArrayList;
import java.util.Collections;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    /*
       stringCollection = new StringCollection()
       words = populateWords(stringCollection)
       Collections.sort(words)
       printStrings(words)
    */
    public static void main(String[] args){
        StringCollection stringCollection= new StringCollection();//holding our parsed strings
        ArrayList<Word> words= populateWords(stringCollection);
        Collections.sort(words);
        printParsedStrings(words);
    }
    /*
    for(int x in sizeOf(list))
        if (word not in list)
            add word
        else
            increase word freq
        end if
     end for
     */
    public static ArrayList<Word> populateWords(StringCollection stringCollection){
        ArrayList<Word> words =new ArrayList<>();
        for(int x=0;x<stringCollection.parsedStrings.size();x++){
            if(indexOf(stringCollection.parsedStrings.get(x),words)==-1){//does not have the word in the aList
                words.add(new Word(stringCollection.parsedStrings.get(x)));//adds the word to the list
            } else{//has the word in the aList
                words.get( indexOf(stringCollection.parsedStrings.get(x),words)).increaseQuantity();//increases quantity
            }
        }
        return words;
    }
    /*
   for(int x in sizeOf(words))
       if (word = word at x)
           return x
       end if
    end for
    return -1
    */
    public static int indexOf(String word, ArrayList<Word> words){
        for(int x=0;x<words.size();x++){
            if(word.equals(words.get(x).word)){
                return x;
            }
        }
        return -1;
    }
    /*
        for(int x in words size)
            print word at x
         end loop
     */

    public static void printParsedStrings(ArrayList<Word> words){
        for(int x=0;x<words.size();x++){
            System.out.println(String.format("%-10s: %-10s",words.get(x).word,words.get(x).quantity));
        }
    }
}
