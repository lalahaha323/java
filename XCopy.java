/*************************************************************************
	> File Name: XCopy.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 19时32分53秒
 ************************************************************************/

class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}

