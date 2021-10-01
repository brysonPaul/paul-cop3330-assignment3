package ex41;

import java.io.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */

/*
PSEUDOCODE
 f= new file("name of file")
 sc= new Scanner(f)

 strings = processFileInput(sc)
 strings = sortString(strings)
 outputStringsToFile(strings)
 */

public class App {
    public static void main(String[] args) {
        try {
            StringCollection s = new StringCollection();
            s.sortStrings();
            s.outputStringsToFile();
        }catch (IOException ex){
            System.out.println("Could not write to file, an error occurred");
        }

    }

}