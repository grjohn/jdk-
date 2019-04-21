package threadstudy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class doublechecked {
    /**
      *@Classname doublechecked
      *@Description 懒汉式-多线程DoubleChecked单例
      *@Author John
      *@Date 2019/4/19 21:10
      *@Version 1.0
    */

    private volatile static doublechecked instance;
    private doublechecked(){

    }
    //优点：线程安全；延迟加载；效率较高。
    public static doublechecked getInstance(){
        if(instance!=null){
            return instance;
        }
        synchronized (doublechecked.class){
            if(instance==null){
                instance = new doublechecked();
                //1.开辟空间    //2.初始化对象信息    //3.返回对象地址
                //可能造成指令重排，3在2或者1前，故用volatile
            }
        }

        return instance;
    }
    public static void main(String[] args) {
        Thread t  = new Thread(()->{
            System.out.println(doublechecked.getInstance());
        });
        t.start();
        Lock lock = new ReentrantLock();
        System.out.println(doublechecked.getInstance());
    }
}
