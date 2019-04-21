package annotationStudy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.FIELD}) //表示注解在什么位置(属性)
@Retention(RetentionPolicy.RUNTIME) //注解生命周期(运行时，可以被反射机制读取)
public @interface stufield {
    String columnName();    //定义属性信息
    String type() default "";  //参数类型 参数名 默认值;
    int length();
}
