/*************************************************************************
	> File Name: ChartUtilDemo.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月05日 星期三 17时15分46秒
 ************************************************************************/
import java.io.*;

class CharUtil {
    public static void dump(Reader src, Writer dest) throws IOException {
        try(Reader input = src; Writer output = dest) {
            char[] data = new char[1024];
            int length;
            while((length = src.read(data)) != -1) {
                dest.write(data, 0, length);
            }
        }
    }
}
public class ChartUtilDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        StringWriter writer = new StringWriter();
        CharUtil.dump(reader, writer);
        System.out.println(writer.toString());
    }
}

