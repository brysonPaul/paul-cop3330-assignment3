package ex43;

import java.io.IOException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        String siteName = strIO("Site Name: ",sc);
        String author = strIO("Author: ",sc);
        String js= strIO("Do you want a folder for JavaScript? ",sc);
        String css= strIO("Do you want a folder for CSS? ",sc);
        boolean jsBool=false;
        boolean cssBool=false;
        if(js.equalsIgnoreCase("Y")){
            jsBool=true;
        }

         if(css.substring(0,1).equalsIgnoreCase("Y")){
            cssBool=true;
        }


        WebsiteMaker w= new WebsiteMaker(siteName,author,jsBool,cssBool);
    }
    public static String strIO(String str, Scanner sc){
        System.out.print(str);
        return sc.nextLine();
    }
}
