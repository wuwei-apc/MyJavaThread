package Day03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassName : TestDemo  //类名
 * @Description : 测试类  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/4  23:40
 */
public class TestDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 多线程第三种实现方式:
         *    . 特点：可以获取多线程返回值
         *    1.创建一个实现接口Callable的类
         *    2.重写call (有返回值的，表示多线程运行结果)
         *    3.创建自定义类的对象（表示多线程要执行的任务）
         *    4.创建FutureTask对象（作用管理多线程运行结果）
         *    5.创建Thread类对象，并启动(表示线程)
         */
        // 创建自定义类对象
        ThirdThread thirdThread = new ThirdThread();
        // 创建FutureTask对象
        FutureTask<Integer> futureTask =new FutureTask<Integer>(thirdThread);
        // 创建线程对象
        Thread t0 = new Thread(futureTask);
        // 开启线程
        t0.start();
        // 获取多线程结果
        Integer result = futureTask.get();
        // 输出多线程计算结果
        System.out.println(result);
    }
}
