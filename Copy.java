/*************************************************************************
	> File Name: Copy.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月02日 星期日 19时10分43秒
 ************************************************************************/
import java.io.*;

class IO {
    public static void dump(InputStream src, OutputStream dest) throws IOException {
        try(InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}

public class Copy {
    public static void main(String[] args) throws IOException {
        IO.dump(
                new FileInputStream(args[0]),
                new FileOutputStream(args[1])
        );
    }
}
