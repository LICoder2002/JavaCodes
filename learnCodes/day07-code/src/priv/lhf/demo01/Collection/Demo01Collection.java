package priv.lhf.demo01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
    java.util.Collection接口
        所有单列集合的最顶层接口，里面定义了所有单列集合的共性方法
        任意集合都可以使用Collection接口中的方法

        共性方法：
        -public boolean add(E e): 把给定的元素添加到集合中
        -public void clear(): 清空集合中的所有元素
        -public boolean remove(E e): 把给定的对象在当前集合中删除
        -public boolean contains(E e): 判断当前集合中是否包含给定的对象
        -public boolean isEmpty(): 判断当前集合是否为空
        -public int size(): 返回集合中的元素个数
        -public Object[] toArray(): 把集合中的元素存储到数组中
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll); //重写了toString方法 []

        //把给定的元素添加到集合中 public boolean add(E e)
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll);
        //        -public boolean remove(E e): 把给定的对象在当前集合中删除
        boolean b2 = coll.remove("赵六");
        System.out.println(b2);
        boolean b3 = coll.remove("赵四");
        System.out.println(b3);

        //-public boolean contains(E e): 判断当前集合中是否包含给定的对象
        boolean b4 = coll.contains("李四");
        boolean b5 = coll.contains("赵四");
        System.out.println(b4);
        System.out.println(b5);

        //-public boolean isEmpty(): 判断当前集合是否为空

        boolean b6 = coll.isEmpty();
        System.out.println(b6);


       // -public int size(): 返回集合中的元素个数
        int sz = coll.size();
        System.out.println("size = " + sz);

        //        -public Object[] toArray(): 把集合中的元素存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        coll.clear();
        System.out.println(coll);

    }
}
