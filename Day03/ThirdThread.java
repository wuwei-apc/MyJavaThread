package Day03;

import java.util.concurrent.Callable;

/**
 * @ClassName : ThirdThread  //类名
 * @Description : 多线程第三种实现方式  //描述
 * @Author : zpc20 //作者
 * @Date: 2023/8/4  23:39
 */
public class ThirdThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 求1-100之间的和
        Integer sum = 0;
        for (int i = 0; i <=100; i++) {
            sum+=i;
        }
        return sum;
    }
}
