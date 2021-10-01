package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class StringCollection
{
    public File f;
    public Scanner sc;
    public ArrayList<String> strings;

    public StringCollection(){
        try {
            initializeFileAndScanner();
            processFileInput(sc);
        }
        catch(FileNotFoundException ex){
            System.out.println("File specified not found");
        }

    }
    //WILL ONLY BE USED BY TESTS
   public StringCollection(String str){
       try {
           initializeFileAndScanner(str);
           processFileInput(sc);
       }
       catch(FileNotFoundException ex){
           System.out.println("File specified not found");
       }
   }
    /*
        f = new file(nameOfInput)
        sc = new Scanner(f)
     */
    public void initializeFileAndScanner() throws FileNotFoundException {
        try {
            f = new File("src/main/java/ex41/exercise41_input.txt");
            sc = new Scanner(f);
        }
        catch (FileNotFoundException ex){
        }
    }
    //WILL ONLY BE USED BY TESTS
    public void initializeFileAndScanner(String str) throws FileNotFoundException {
        try {
            f = new File(str);
            sc = new Scanner(f);
        }
        catch (FileNotFoundException ex){
        }
    }

    /*
   while(file has lines to read)
       String s= line of text
       aListString.add(s)
       end while
    */
    public void processFileInput(Scanner sc){
        ArrayList<String> strs = new ArrayList<>();
        while(sc.hasNextLine()){
            strs.add(sc.nextLine());
        }
        strings=strs;
    }

    /*
        for(x=0;x<size-1;x++){
            for(y=x+1;y<size;y++){
                find lowest one
            }
            switch one at x with one found in the rest of loop
        }
     */
    public void sortStrings(){
        //PSEUDOCODE EXPLAINING WHAT THE SORT IS DOING (I mean this sort probably is using merge or quicksort,
        // not insertion, but you get the point :))
        Collections.sort(strings);//the exercise did not say I could not use built-in sorting features
    }

    /*
        outputfile= new File(nameOfFile);
         fw= new FileWriter;
        for(x in strings)
            fw.print(x)
        end for
     */
    public void outputStringsToFile() throws IOException {
        File outputFile = new File("src/main/java/ex41/exercise41_output.txt");
        outputFile.createNewFile();
        FileWriter fw =new FileWriter(outputFile);
        fw.write("Total of "+ strings.size() +" names\n-----------------\n");
        for(String x: strings){
            fw.write(x+"\n");
        }
        fw.close();
    }
    //TESTING PURPOSES ONLY
    public void outputStringsToFile(String str) throws IOException {
        File outputFile = new File(str);
        outputFile.createNewFile();
        FileWriter fw =new FileWriter(outputFile);
        fw.write("Total of "+ strings.size() +" names\n-----------------\n");
        for(String x: strings){
            fw.write(x+"\n");
        }
        fw.close();
    }
}
