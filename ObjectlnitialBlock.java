/*************************************************************************
	> File Name: ObjectlnitialBlock.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月22日 星期四 14时58分35秒
 ************************************************************************/
class Other {
    {
        System.out.println("对象初始区块");
    }

    Other() {
        System.out.println("Other() 构造函数");
    }

    Other(int o) {
        this();
        System.out.println("Other(int o) 构造函数");
    }
}
public class ObjectlnitialBlock {
    public static void main(String[] args) {
        new Other(1);
    }
}
