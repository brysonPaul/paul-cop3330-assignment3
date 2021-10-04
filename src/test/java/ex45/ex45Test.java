package ex45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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
    }
}