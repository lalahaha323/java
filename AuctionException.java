/*************************************************************************
	> File Name: AuctionException.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 11时40分48秒
 ************************************************************************/

public class AuctionException extends Exception {
    //无参数的构造器
    public AuctionException() {}
    //带一个字符串参数的构造器
    public AuctionException(String msg) {
        super(msg);
    }
}
