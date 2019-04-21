package threadstudy;

/**
 * @Classname chongrusuo
 * @Description 重入锁，需要对于当前线程与之前锁的线程判断以及重入锁的深度
 * @Author John
 * @Date 2019/4/19 22:56
 * @Version 1.0
 */


public class chongrusuo {
    public static class relock{
        public int count=0;
        private boolean islock = false;
        Thread tem = null;

        public synchronized void lock() throws InterruptedException {

            Thread thisthread = Thread.currentThread();
            while(islock && thisthread!=tem){
                wait();
            }
            //注意！！！！！
            //wait()文档说明要放到while中，因为阻塞后，如果是if，会直接执行后续，而while会再判断一次条件
            //防止多个线程时发生错误
            count++;
            islock = true;
            tem = thisthread;
        }
        public synchronized void unclock(){
            if(Thread.currentThread()==tem){
                count--;
                if(count==0) {
                    islock = false;
                    notify();
                    tem=null;
                }
            }
        }

    }
    public static void a(relock lock) throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().toString()+":a方法 深度:"+lock.count);
        b(lock);
        lock.unclock();
    }
    public static void b(relock lock) throws InterruptedException {
        lock.lock();
        System.out.println(Thread.currentThread().toString()+":b方法 深度:"+lock.count);
        lock.unclock();
    }

    public static void main(String[] args) throws InterruptedException {
        relock lock = new relock();
        Thread t1 = new Thread(()->{
            try {
                a(lock);
                Thread.sleep(100);
                b(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()->{
            try {
                a(lock);
                b(lock);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
    }
}
