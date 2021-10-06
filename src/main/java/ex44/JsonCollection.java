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

public class JsonCollection {

     ArrayList<Map<?,?>> map;
     Scanner sc;
     File f;
     public JsonCollection(){
          try {
               processFileInput();
          }
          catch(FileNotFoundException ex){
               System.out.println("File specified not found");
          } catch (IOException e) {
               e.printStackTrace();
          }
     }
     public JsonCollection(String str) throws IOException {
          try {
               processFileInput();
          }
          catch(FileNotFoundException ex){
               System.out.println("File specified not found");
          }
     }
     /*
      while(file has lines to read)
          String s= line of text
          aListString.add(s)
          end while
       */
     public void processFileInput() throws IOException {
          String json="";
          Reader r= Files.newBufferedReader(Paths.get("src/main/java/ex44/exercise44_input.json"));

          Gson gson = new Gson();
          map =gson.fromJson(r,map.getClass());
          r.close();

     }

}
