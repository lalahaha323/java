/*************************************************************************
	> File Name: WriteObject.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月08日 星期三 18时09分44秒
 ************************************************************************/
import java.io.*;
public class WriteObject {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))) {
            Person per = new Person("孙悟空", 500);
            oos.writeObject(per);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

