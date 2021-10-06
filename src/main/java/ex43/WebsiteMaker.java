package ex43;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class WebsiteMaker
{
    public String siteName;
    public String author;
    public boolean jsFolder;
    public boolean cssFolder;

    public WebsiteMaker(String siteName, String author, boolean jsFolder, boolean cssFolder) throws IOException {
        this.siteName = siteName;
        this.author = author;
        this.jsFolder = jsFolder;
        this.cssFolder = cssFolder;

        makeSite();
        makeJSFolder();
        makeCSSFolder();
    }
    void makeSite() throws IOException {
        String dirPath= "src/main/java/ex43/website/"+siteName;
        String htmlPath=dirPath+"/index.html";
        addAuthorAndSiteName(new File(htmlPath));
        System.out.println("Created "+(new File(dirPath)).getCanonicalPath());

    }
    void addAuthorAndSiteName(File f){

    }
    void makeJSFolder(){
        if(!jsFolder) {
            return;
        }
    }
    void makeCSSFolder(){
        if(!cssFolder) {
            return;
        }
    }


}
