package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class StringCollection
{
    public File f;
    public Scanner sc;
    public ArrayList<String[]> parsedStrings;

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
            f = new File("src/main/java/ex42/exercise42_input.txt");
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
       parsedStrings = parseInput(strs);
    }

    /*
    for(x in strings)
        str[] =x.split(,)
        Alist.get(index)[0]=str[0]
        Alist.get(index)[1]=str[1]
        Alist.get(index)[2]=str[2]
    end loop
     */
    public ArrayList<String[]> parseInput(ArrayList<String> strings){
        ArrayList<String[]> inp = new ArrayList<String[]>();
        for(int x=0;x<strings.size();x++){
            String[] str = strings.get(x).split(",");//should be three
            inp.add(str);
        }
        return inp;
    }
    /*
        for(String[] x in parsedStrings)
            print(contents of x)
        end loop
     */
    public void printParsedStrings(){
        System.out.println(String.format("%-9s %-9s %-9s\n---------------------------","Last","First","Salary"));
        for(int x=0;x<parsedStrings.size();x++){
            System.out.println(String.format("%-9s %-9s %-9s",parsedStrings.get(x)[0],parsedStrings.get(x)[1],parsedStrings.get(x)[2]));
        }
    }
}