package priv.lhf.demo4;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /*
    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
    将数组中指定的数据拷贝到另一个数组中
     */
    private static void demo02() {
        int[] src = {1, 2, 3 ,4 ,5};

        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("拷贝前：" + Arrays.toString(dest));

        //将src前三个元素拷贝的的dest中
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("拷贝后：" + Arrays.toString(dest));

    }

    /*
        public static long currentTimeMillis(); 返回以毫秒为单位的当前时间
        用程序来验证for循环打印数字1——9999所需要的时间（毫秒）
     */
    private static void demo01() {

        long s = System.currentTimeMillis();
        for(int i = 1; i <= 9999; ++i)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        long e = System.currentTimeMillis();
        System.out.println("程序耗时：" + (e - s) + "毫秒");
    }
}
