package ex41;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class ex41Test extends TestCase {

   @Test
   public void testSorting() throws IOException {//if this works everything is bound to work since they are so bound together
       StringCollection s = new StringCollection("src/test/java/ex41/input");
       s.sortStrings();
       boolean t=true;
       for(int x=0;x<s.strings.size()-1;x++){
           if(s.strings.get(x).compareTo(s.strings.get(x))>0){
               t=false;
           }
       }
       assertTrue(t);
   }

    public void testInitializeFileAndScanner() {
        StringCollection s = new StringCollection("src/test/java/ex41/input");
        assertEquals(s.f.getPath(),"src\\test\\java\\ex41\\input");
    }

    public void testProcessFileInput() {
        StringCollection s = new StringCollection("src/test/java/ex41/input");
        assertEquals(7,s.strings.size());
    }

}