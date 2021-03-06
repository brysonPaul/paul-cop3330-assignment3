package ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
class ex45Test {

    @Test
    void replaceWords() {
        StringCollection s = new StringCollection("src/test/java/ex45/input.txt");
        WordSwitcher w = new WordSwitcher("friend", "buddy");
        ArrayList<String> sAlist= App.replaceWords(s,w);

        assertEquals(sAlist.get(0),"My buddy Nathan is an amazing buddy");
        assertEquals(sAlist.get(1),"He helps me out when I am bored");
        assertEquals(sAlist.get(2),"What an outstanding buddy!!");
    }

    @Test
    public void initializeFileAndScanner() {
        ex42.StringCollection s= new ex42.StringCollection("src/test/java/ex45/input.txt");
        assertEquals(s.f.getPath(),"src\\test\\java\\ex45\\input.txt");
    }

    @Test
    public void processFileInput() {
        StringCollection s= new StringCollection();
        assertEquals(3,s.strings.size());
    }

    @Test
    void outputStringsToFile() throws IOException {
        StringCollection s = new StringCollection("src/test/java/ex45/input.txt");
        WordSwitcher w = new WordSwitcher("friend", "buddy");
        s.strings = App.replaceWords(s,w);
        s.outputStringsToFile("src/test/java/ex45/output.txt");

        StringCollection s1= new StringCollection("src/test/java/ex45/output.txt");
        assertEquals(s1.strings.get(0),"My buddy Nathan is an amazing buddy");
        assertEquals(s1.strings.get(1),"He helps me out when I am bored");
        assertEquals(s1.strings.get(2),"What an outstanding buddy!!");
    }

    @Test
    void replaceWordIfThere() {
        String str = "cheese is an amazing food";

        WordSwitcher w1 = new WordSwitcher("cheese","food");
        str = w1.replaceWordIfThere(str);
        assertEquals(str, "food is an amazing food");

        WordSwitcher w2 = new WordSwitcher("Two","one");
        str = w2.replaceWordIfThere(str);
        assertEquals(str, "food is an amazing food");

        WordSwitcher w3 = new WordSwitcher("food","sink");
        str = w3.replaceWordIfThere(str);
        assertEquals(str, "sink is an amazing sink");
    }
}