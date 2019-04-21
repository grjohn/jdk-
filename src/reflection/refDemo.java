package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import annotationStudy.student;
/**
 * @Classname refDemo
 * @Description TODO
 * @Author John
 * @Date 2019/4/21 20:33
 * @Version 1.0
 */
public class refDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class<?> stuClass = Class.forName("annotationStudy.student");

        //获取类名
        System.out.println("类名:"+stuClass.getName());
        System.out.println("类名:"+stuClass.getSimpleName());

        //获取属性信息
        Field[] fields = stuClass.getFields();
        Field[] declaredFields = stuClass.getDeclaredFields();
        System.out.println("属性:"+fields.length);  //只有public声明
        System.out.println("属性:"+declaredFields[0]);  //全部

        //获取方法
        Method[] declaredMethods = stuClass.getDeclaredMethods();
        Method m01 = stuClass.getDeclaredMethod("setName",String.class);    //给出参数，区别重载
        for(Method m:declaredMethods){
            System.out.println("方法:"+m);
        }
        System.out.println("方法:"+m01);

        //获取构造器信息(构造函数)
        Constructor<?>[] declaredConstructors = stuClass.getDeclaredConstructors();
        for(Constructor constructor:declaredConstructors){
            System.out.println("构造器:"+constructor);
        }

        //获取对象实例
        student s = (student)stuClass.newInstance();    //调用student无参构造方法，没有无参的话会报错
        //调用其它构造函数
        Constructor<student> declaredConstructor = (Constructor<student>) stuClass.getDeclaredConstructor(String.class, int.class, int.class);
        student chen = declaredConstructor.newInstance("chen", 10, 10);
        System.out.println("学生:"+chen.getName());

        //通过反射api调用普通方法
        Method setName = stuClass.getMethod("setName", String.class);
        setName.invoke(s, "姜");
        System.out.println("学生2："+s.getName());

        //通过反射api操作属性
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);   //不需要执行安全检查(可以提高性能)，对于private属性，直接访问
        name.set(s,"刘");
        System.out.println("学生2改："+s.getName());
    }
}
