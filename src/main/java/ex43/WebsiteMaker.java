package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


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

    }
    public WebsiteMaker(String siteName, String author, boolean jsFolder, boolean cssFolder,String dir) throws IOException {
        this.siteName = siteName;
        this.author = author;
        this.jsFolder = jsFolder;
        this.cssFolder = cssFolder;
        makeSite(dir);

    }
    /*
        dirPath="src/main/java/../sitename/"
        htmlPath= dirPath+"index.html";
        addauthorandSiteName()
        makeJSFolder()
        makeCSSFOlder()
     */
    void makeSite() throws IOException {
        String dirPath= "src/main/java/ex43/website/"+siteName+"/";
        new File(dirPath).mkdirs();
        String htmlPath=dirPath+"index.html";
        System.out.println("Created "+(new File(dirPath)).getPath());
        addAuthorAndSiteName(new File(htmlPath));
        makeJSFolder(dirPath);
        makeCSSFolder(dirPath);
    }
    //FOR TESTING
    void makeSite(String dirPath) throws IOException{
        new File(dirPath).mkdirs();
        String htmlPath=dirPath+"index.html";
        System.out.println("Created "+(new File(dirPath)).getPath());
        addAuthorAndSiteName(new File(htmlPath));
        makeJSFolder(dirPath);
        makeCSSFolder(dirPath);
    }
    /*
        f.createNewFile()
        fw= new FileWriter;
        write(sitename)
        write(author);
     */
    void addAuthorAndSiteName(File f) throws IOException {
        f.createNewFile();
        FileWriter fw= new FileWriter(f);
        fw.write("<title> "+siteName+"</title>\n");
        fw.write("<meta> "+author+"</meta>\n");
        fw.close();
        System.out.println("Created "+f.getPath());

    }
    /*
        if(jsFolder==true)
            make js folder
        end if
        else return end else
     */
    void makeJSFolder(String path) throws IOException {
        if(!jsFolder) {
            return;
        }
         File f = new File((path+"js"));
        f.mkdir();
        System.out.println("Created "+f.getPath());

    }
    /*
        if(cssFolder==true)
            make js folder
        end if
        else return end else
     */
    void makeCSSFolder(String path) throws IOException {
        if(!cssFolder) {
            return;
        }
        File f= new File(path+"css");
        f.mkdir();
        System.out.println("Created "+f.getPath());
    }


}
