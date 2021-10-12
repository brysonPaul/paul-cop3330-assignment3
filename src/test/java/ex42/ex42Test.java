package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
class ex42Test {
    @Test
    public void testInitializeFileAndScanner() {
        StringCollection s= new StringCollection("src/test/java/ex42/input.txt");
        assertEquals(s.f.getPath(),"src\\test\\java\\ex42\\input.txt");
    }
    @Test
    public void testProcessFileInput() {
        StringCollection s= new StringCollection();
        assertEquals(7,s.parsedStrings.size());
    }
    @Test
    public void testParseInput() {
        StringCollection s= new StringCollection("src/test/java/ex42/input.txt");
        assertEquals(s.parsedStrings.get(0)[0],"Rhonda");
        assertEquals(s.parsedStrings.get(0)[1],"Jones");
        assertEquals(s.parsedStrings.get(0)[2],"25000");
        assertEquals(s.parsedStrings.get(4)[0],"Maximus");
        assertEquals(s.parsedStrings.get(4)[1],"Whitaker");
        assertEquals(s.parsedStrings.get(4)[2],"5400");
        assertEquals(s.parsedStrings.get(6)[0],"Nathan");
        assertEquals(s.parsedStrings.get(6)[1],"Miriki");
        assertEquals(s.parsedStrings.get(6)[2],"50002");
    }
}