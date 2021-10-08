package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ex41Test {
    @Test
    public void testSorting() throws IOException {//if this works everything is bound to work since they are so bound together
        StringCollection s = new StringCollection("src/test/java/ex41/input.txt");
        s.sortStrings();
        boolean t=true;
        for(int x=0;x<s.strings.size()-1;x++){
            if(s.strings.get(x).compareTo(s.strings.get(x))>0){
                t=false;
            }
        }
        assertTrue(t);
    }
    @Test
    public void testInitializeFileAndScanner() {
        StringCollection s = new StringCollection("src/test/java/ex41/input.txt");
        assertEquals(s.f.getPath(),"src\\test\\java\\ex41\\input.txt");
    }

    @Test
    public void testProcessFileInput() {
        StringCollection s = new StringCollection("src/test/java/ex41/input.txt");
        assertEquals(7,s.strings.size());
    }

    @Test
    public void testOutputStringToFile() throws IOException {
        StringCollection s = new StringCollection("src/test/java/ex41/input.txt");
        s.sortStrings();
        s.outputStringsToFile("src/test/java/ex41/output.txt");
        StringCollection s1 = new StringCollection("src/test/java/ex41/output.txt");
        assertEquals(s1.strings.get(2),"Brian Mercier");//first
        assertEquals(s1.strings.get(8),"Rhonda Jones");//last

    }
}