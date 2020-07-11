package cn.enjoyedu.ch7.dcl;

/**
 * 懒汉式-双重检查
 */
public class SingleDcl {
    private static SingleDcl singleDcl;
    private SingleDcl(){
    }

    public static SingleDcl getInstance(){
        if (singleDcl == null){ //第一次检查，不加锁
            System.out.println(Thread.currentThread()+" is null");
            synchronized(SingleDcl.class){ //加锁
                if (singleDcl == null){ //第二次检查，加锁情况下
                    System.out.println(Thread.currentThread()+" is null");
                    singleDcl = new SingleDcl();
                }
            }
        }
        return singleDcl;
    }
}
