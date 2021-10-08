package ex44;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ex44Test {

    @Test
    void initializeFileAndScanner() throws IOException {//to test ill call the constructor that takes in a string path. If the path of the scanner is valid, it is valid
        JsonCollection js= new JsonCollection("src/test/java/ex44/test44.json");
        assertEquals("src\\test\\java\\ex44\\test44.json",js.f.getPath());
        assertEquals(js.p.products.size(),6);
    }

    @Test
    void processFileInput() throws IOException {
        JsonCollection js= new JsonCollection("src/test/java/ex44/test44.json");
        assertEquals(js.p.products.get(0).price,100.00);
        assertEquals(js.p.products.get(0).name,"Sword");
        assertEquals(js.p.products.get(0).quantity,5);

        assertEquals(js.p.products.get(2).price,75.00);
        assertEquals(js.p.products.get(2).name,"Shield");
        assertEquals(js.p.products.get(2).quantity,2);

        assertEquals(js.p.products.get(5).price,500.00);
        assertEquals(js.p.products.get(5).name,"Diamond");
        assertEquals(js.p.products.get(5).quantity,2);

    }

    @Test
    void containsProduct() throws IOException {
        JsonCollection jc= new JsonCollection("src/test/java/ex44/test44.json");
        assertEquals(App.containsProduct(jc,"Silver"),-1);
        assertEquals(App.containsProduct(jc,"Diamond"),5);
        assertEquals(App.containsProduct(jc,"Sword"),0);
    }
}