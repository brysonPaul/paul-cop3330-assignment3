package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Bryson Paul
 */
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
        System.out.println("Created "+parsePath((new File(dirPath)).getPath()));
        addAuthorAndSiteName(new File(htmlPath));
        makeJSFolder(dirPath);
        makeCSSFolder(dirPath);
    }
    /*
        index = str.indexOf(webSite);
        if index != -1
            return substring of path w/o word "website"
        else return ".//website"+str
        end if
     */
    public String parsePath(String path){
        int indexOfParse=path.indexOf("website");
        if(indexOfParse!=-1){
            return parsePath(path.substring(indexOfParse+7));
        }
        else return ".\\website"+path;
    }
    //FOR TESTING
    void makeSite(String dirPath) throws IOException{
        new File(dirPath).mkdirs();
        String htmlPath=dirPath+"index.html";
        System.out.println("Created "+parsePath((new File(dirPath)).getPath()));
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
        System.out.println("Created "+parsePath(f.getPath()));

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
        System.out.println("Created "+parsePath(f.getPath())+"\\");

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
        System.out.println("Created "+parsePath(f.getPath())+"\\");
    }


}
