/*************************************************************************
	> File Name: ArrayUtils.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月07日 星期二 22时46分50秒
 ************************************************************************/

public class ArrayUtils {
    public static int search(String[] array, String target) {
        for(int i = 0; i < array.length; i++){
            if(array[i] != null && array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
