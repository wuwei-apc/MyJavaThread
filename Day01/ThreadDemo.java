package Day01;

/**
 * @ClassName : ThreadDemo  //类名
 * @Description : 多线程的第一种启动方法  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/3  23:38
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /**
         * 多线程的第一种启动方法：
         *    1.定义一个类继承Thread类
         *    2.重写Run方法
         *    3.创建自定义子类对象，并启动线程
         */
        FirstThread t0 = new FirstThread();
        FirstThread t1 = new FirstThread();
        // 不使用seName方法给线程复制则为默认值加递增序列
        t0.setName("线程1");
        t1.setName("线程2");
        // 开启线程
        t0.start();
        t1.start();

    }
}
