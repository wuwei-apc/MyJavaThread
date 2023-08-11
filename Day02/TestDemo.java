package Day02;

/**
 * @ClassName : TestDemo  //类名
 * @Description : 测试类  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/4  23:26
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 多线程的第二种启动方式
         *  1.自定义一个类实现Runnable接口
         *  2.重写里面的run方法
         *  3.创建自定类对象
         *  4.创建一个Thread类的对象，并开启线程
         */
        // 创建SecondThread
        //表示线程要执行的任务
        SecondThread myrun = new SecondThread();

        // 创建线程对象
        Thread t0 = new Thread(myrun);
        Thread t1 = new Thread(myrun);

        // 为线程设置名称
        t0.setName("线程0");
        t1.setName("线程1");

        // 开启线程
        t0.start();
        t1.start();
    }
}
