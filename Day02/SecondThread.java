package Day02;

/**
 * @ClassName : SecondThread  //类名
 * @Description : 多线程第二种实现方法  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/4  23:25
 */
public class SecondThread implements Runnable{

    @Override
    public void run() {
        // 书写线程执行代码
        for (int i = 0; i < 100; i++) {
            // 获取当前线程对象获取线程名称
//            Thread current = Thread.currentThread();
//            System.out.println(current.getName()+":"+"Hello,World!");
            System.out.println(Thread.currentThread().getName()+":"+"Hello,World!");

        }
    }
}
