package priv.lhf.demo04.Supplier;

import java.util.function.Supplier;

/*
    求数组中的做大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值
 */
public class Demo02Test {
    public static int getMax(Supplier<Integer> sup)
    {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1000, 40, -189, 8906, 98};

        int max = getMax(()->{
           int m = arr[0];
            for (int i : arr) {
                if(i>m)
                {
                    m = i;
                }
            }
            return m;
        });

        System.out.println(max);
    }
}
