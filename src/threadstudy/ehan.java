package threadstudy;

/**
 * @Classname ehan
 * @Description 饿汉式单例模式
 * @Author John
 * @Date 2019/4/19 22:17
 * @Version 1.0
 */
public class ehan {
    private static final ehan instance= new ehan();
    private ehan(){

    }
    public static ehan getInstance(){
        return instance;
    }
    //优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。

    //缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
}
