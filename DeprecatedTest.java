/*************************************************************************
	> File Name: DeprecatedTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 12时52分09秒
 ************************************************************************/
class Apple {
    //定义info方法已经过时
    //since属性指定从哪个版本开始，forRemoval指定该API将来会被删除
    @Deprecated(since="9", forRemoval=true) public void info() {
    System.out.println("Apple的info方法");
    }
}
public class DeprecatedTest {
    public static void main(String[] args) {
        //下面使用info()方法时将会被编译器警告
        new Apple().info();
    }
}

