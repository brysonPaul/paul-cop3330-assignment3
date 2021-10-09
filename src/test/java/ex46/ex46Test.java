package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ex46Test {
    @Test
    public void testPopulateWords() {
        StringCollection stringCollection= new StringCollection("src/test/java/ex46/input.txt");
        ArrayList<Word> words= App.populateWords(stringCollection);
        Collections.sort(words);
        assertEquals(words.size(),6);
        assertEquals(words.get(0).quantity.length(),5);
        assertEquals(words.get(1).quantity.length(),4);
        assertEquals(words.get(2).quantity.length(),3);
        assertEquals(words.get(3).quantity.length(),3);
        assertEquals(words.get(4).quantity.length(),3);
        assertEquals(words.get(5).quantity.length(),3);
    }
    @Test
    public void testIndexOf() {
        StringCollection stringCollection= new StringCollection("src/test/java/ex46/input.txt");
        ArrayList<Word> words= ex46.App.populateWords(stringCollection);
        Collections.sort(words);
        assertEquals(App.indexOf("one",words),1);
    }
    @Test
    public void testSort(){
        ArrayList<Word> words= new ArrayList<>();
        Word x= new Word("one");
        Word y= new Word("two");
        y.increaseQuantity();
        words.add(x);
        words.add(y);
        Collections.sort(words);
        assertEquals(words.get(0).word,"two");
    }
    @Test
    public void testInitializeFileAndScanner() {
        StringCollection stringCollection= new StringCollection("src/test/java/ex46/input.txt");
        assertEquals(stringCollection.f.getPath(),"src\\test\\java\\ex46\\input.txt");
    }
    @Test
    public void testProcessFileInput() {
        StringCollection stringCollection= new StringCollection("src/test/java/ex46/input.txt");
        assertEquals(stringCollection.parsedStrings.size(),21);
    }
    @Test
    public void testParseInput(){
        StringCollection stringCollection= new StringCollection("src/test/java/ex46/input.txt");
        assertEquals(stringCollection.parsedStrings.get(0),"one");
        assertEquals(stringCollection.parsedStrings.get(1),"one");
        assertEquals(stringCollection.parsedStrings.get(2),"two");
        assertEquals(stringCollection.parsedStrings.get(3),"three");
        assertEquals(stringCollection.parsedStrings.get(4),"four");
        assertEquals(stringCollection.parsedStrings.get(5),"four");
        assertEquals(stringCollection.parsedStrings.get(6),"five");
        assertEquals(stringCollection.parsedStrings.get(7),"six");
        assertEquals(stringCollection.parsedStrings.get(8),"six");
        assertEquals(stringCollection.parsedStrings.get(9),"two");
        assertEquals(stringCollection.parsedStrings.get(10),"one");
        assertEquals(stringCollection.parsedStrings.get(20),"three");
    }

}