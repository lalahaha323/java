/*************************************************************************
	> File Name: Down2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 19时02分12秒
 ************************************************************************/
import java.io.*;
import java.net.URL;

public class Down2 {
    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("http://openhome.cc/Gossip/Encoding/"),
            new URL("http://openhome.cc/Gossip/Scala/"),
            new URL("http://openhome,cc/Gossip/JavaScript/"),
            new URL("http://openhome.cc/Gossip/Python/")
        };

        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

        for(int i = 0;i < urls.length; i++) {
            dump(urls[i].openStream(), new FileOutputStream(fileNames[i]));
        }
    }
    static void dump(InputStream src, OutputStream dest)throws IOException {
        try (src; dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}

