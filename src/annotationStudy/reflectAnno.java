package annotationStudy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Classname reflectAnno
 * @Description TODO
 * @Author John
 * @Date 2019/4/21 15:43
 * @Version 1.0
 */


public class reflectAnno {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class student = Class.forName("annotationStudy.student");  //获取类的信息
        Annotation[] annotations = student.getAnnotations();

        //获取类的注解
        stutable stable1 = (stutable)annotations[0];
        for(Annotation annotation:annotations){
            System.out.println(stable1.value());     //获取类的注解
        }

        //获得类的属性注解
        Field field = student.getDeclaredField("name");
        stufield sfield = field.getAnnotation(stufield.class);
        System.out.println(sfield.columnName()+"-"+sfield.length());    //获取其中的信息
    }
}
