package xpaths;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadXpaths {
    private String xpathPage;

    public LoadXpaths(String xpathPage){
        this.xpathPage = xpathPage;
    }
    public String getXpath(String property) {
        Properties obj = new Properties();
        FileInputStream objfile = null;
        try {
            objfile = new FileInputStream(System.getProperty("user.dir") + xpathPage);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            obj.load(objfile);
        } catch (IOException e) {
            System.out.println(e);
        }
        return obj.getProperty(property);
    }

}
