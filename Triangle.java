/*************************************************************************
	> File Name: Triangle.java
	> Author: 
	> Mail: 
	> Created Time: 2018年11月21日 星期三 15时51分05秒
 ************************************************************************/

class Triangle {
    double area;
    int height;
    int length;
    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.println("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.println("y= " + y);
        System.out.println(", ta area = " + t5.area);
    }
    void setArea() {
        area = (height * length) / 2;
    }
}

