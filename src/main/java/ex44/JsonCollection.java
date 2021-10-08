package ex44;
import com.google.gson.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class JsonCollection {

     Products p= new Products();
     Scanner sc;
     File f;
     public JsonCollection(){
          try {
               initializeFileAndScanner();
               processFileInput(sc);
          }
          catch(FileNotFoundException ex){
               System.out.println("File specified not found");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }
     public JsonCollection(String str) throws IOException {
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
               f = new File("src/main/java/ex44/exercise44_input.json");
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
      end loop
      p= fromJson(s, Products.class)
       */
     public void processFileInput(Scanner sc) throws IOException {
          Gson gson = new Gson();
          String json = "";
          while(sc.hasNextLine()){
                    json+=(sc.nextLine());
          }
          p = gson.fromJson(json,Products.class);
     }

}
