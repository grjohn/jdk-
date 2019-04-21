package annotationStudy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE}) //表示注解在什么位置(类和方法)
@Retention(RetentionPolicy.RUNTIME) //注解生命周期(运行时，可以被反射机制读取)
public @interface stutable {
    String value();
}
