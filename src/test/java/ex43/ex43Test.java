package ex43;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex43Test {

    @Test
    //this is called by WebsiteMaker's constructor, so ill be doing that here
    void makeSite() throws IOException {
        WebsiteMaker ma = new WebsiteMaker("testing","123",false,false,"src/test/java/ex43/website/testing/");
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testing/")),true);
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testing/index.html")),true);
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testing/js")),false);
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testing//css")),false);
    }

    @Test
    void addAuthorAndSiteName() throws IOException {
        WebsiteMaker ma = new WebsiteMaker("testing","123",false,false,"src/test/java/ex43/website/testing/");
        Scanner sc= new Scanner(new File("src/test/java/ex43/website/testing/index.html"));
        assertEquals(sc.nextLine(),"<title> testing</title>");
        assertEquals(sc.nextLine(),"<meta> 123</meta>");
        sc.close();
    }

    @Test
    void makeJSFolder() throws IOException {
        WebsiteMaker ma = new WebsiteMaker("testingJS","123",false,false,"src/test/java/ex43/website/testingJS/");
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testingJS/js")),false);
        ma.jsFolder=true;
        ma.makeJSFolder("src/test/java/ex43/website/testingJS/");
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testingJS/js")),true);
    }

    @Test
    void makeCSSFolder() throws IOException {
        WebsiteMaker ma = new WebsiteMaker("testingCSS","123",false,false,"src/test/java/ex43/website/testingCSS/");
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testingCSS/css")),false);
        ma.cssFolder=true;
        ma.makeCSSFolder("src/test/java/ex43/website/testingCSS/");
        assertEquals(Files.exists(Path.of("src/test/java/ex43/website/testingCSS/css")),true);
    }
}