package ex45;

import java.io.IOException;
import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    /*
        s= new StringCollection
        w = new WordSwitcher("utilize", "use")
        s.strings= replaceWords(s,w)
        s.outputStringsToFile()
     */
    public static void main(String[] args){
        try {
            StringCollection s = new StringCollection();//initialization of StringCollection
            WordSwitcher w= new WordSwitcher("utilize","use");//initialization of wordSwitcher
            s.strings=replaceWords(s,w);//swiches all word occurances based on w's initialization
            s.outputStringsToFile();//outputs new strings to file
        }catch (IOException ex){
            System.out.println("Could not write to file, an error occurred");//safety if file not there to prevent breaking
        }
    }
    /*
        aList a = new Alist<String>
        for(string s in StringCollection.strings)
            String str= replaceWord(s);
            a.add(str)// will just add the original string if keyword not found
     */
    public static ArrayList<String> replaceWords(StringCollection s, WordSwitcher w){
        ArrayList<String> aList= new ArrayList<>();
        for(int x=0;x<s.strings.size();x++){
            String str = w.replaceWordIfThere(s.strings.get(x));
            aList.add(str);
        }
        return aList;
    }
}
