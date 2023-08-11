package Day01;

/**
 * @ClassName : FirstTheard  //类名
 * @Description : My first Thread progress  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/3  23:44
 */
public class FirstThread extends Thread{
    @Override
    public void run() {
//        快速代码提示 100.fori
//        for (int i = 0; i < 100; i++) {
//
//        }
        // 书写线程执行代码
        for (int i = 0; i < 100; i++) {
            // getName()方法获取线程名称
            System.out.println(getName()+":\t"+"Hello,World");
        }
    }
}
