/*************************************************************************
	> File Name: FkTagTest.java
	> Author: 
	> Mail: 
	> Created Time: 2019年05月12日 星期日 17时59分06秒
 ************************************************************************/
@FkTag(age = 5)
@FkTag(name = "疯狂Java", age = 9)
public class FkTagTest {
    public static void main(String[] args) {
        Class<FkTagTest> clazz = FkTagTest.class;
        FkTag[] tags = clazz.getDeclaredAnnotationsByType(FkTag.class);
        for(FkTag tag : tags) {
            System.out.println(tag.name() + "-->" + tag.age());
        }
        FkTags container = clazz.getDeclaredAnnotation(FkTags.class);
        System.out.println(container);
    }
}

