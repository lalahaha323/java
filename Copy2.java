/*************************************************************************
	> File Name: Copy2.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 16时04分33秒
 ************************************************************************/

import java.io.*;

class BufferedIO {
    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try(InputStream input = new BufferedInputStream(src);
                OutputStream output = new BufferedOutputStream(dest)) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
                }
    }
}
public class Copy2 {
    public static void main(String[] args) throws IOException {
        IO.dump(
                new FileInputStream(args[0]),
                new FileOutputStream(args[1])
               );
    }
}

