package ex44;
import com.google.gson.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class JsonCollection {

     ArrayList<Object> products;
     Scanner sc;
     File f;
     public JsonCollection(){
          try {
               products=new ArrayList<>();
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
          end while
       */
     public void processFileInput(Scanner sc) throws IOException {
          //GsonBuilder b= new GsonBuilder();
          //b.registerTypeAdapter(Item.class, new ItemAdapter().nullSafe());
          Gson gson = new Gson();
          String json = "";
          while(sc.hasNextLine()){
                    json+=(sc.nextLine());
          }
          System.out.println(json);

          products = gson.fromJson(json,ArrayList.class);
     }

}
