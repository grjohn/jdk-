package classloader;

import annotationStudy.student;

import java.sql.SQLOutput;

/**
 * @Classname demo1
 * @Description 探究类加载顺序
 * @Author John
 * @Date 2019/4/22 10:20
 * @Version 1.0
 */
public class loaderOrder {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("执行了main方法");
        //主动引用
        A a = new A();
    //    Class.forName("annotationStudy.student");
        System.out.println(a.width);
        A.say();

        //被动引用，不加载
        //student[] students = new student[10];
       // System.out.println(A.length);//final放入常量池
       // System.out.println(B.width);
    }
    static{
        System.out.println("loaderOrder静态代码块加载");
    }
}

class B extends A{
    static{
        System.out.println("静态初始化B");
    }
}

class A{
    public static int width = 100;
    public static final int length = 0;
    //静态语句从上往下顺序赋值,一开始为100，然后为300、

    //静态代码块在类加载时就进行(只运行一次！！)，且静态代码块顺序永远在构造代码块之前(父类子类时)
    //一些代码在项目启动就执行时，可以用静态代码块
    static{
        System.out.println("静态代码块初始化：静态初始化类A");
        width = 300;
    }
    //静态语句块可以给任何位置的静态变量赋值，但只能访问静态语句块之前的静态变量，访问之后会报错

    public static void say(){
        System.out.println("类静态方法执行:"+width);
    }

    //构造代码块在创建对象时被调用，每次创建对象都会调用一次，且优先于构造函数执行
    //每创建一个对象，构造代码块就执行
    {
        System.out.println("普通代码块赋值");
    }
    public A(){
        System.out.println("构造函数：创建A类的对象");
    }
}