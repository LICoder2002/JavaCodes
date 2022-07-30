package priv.lhf.demo07;
/*
局部内部类：如果希望访问所在方法的局部变量，那么这个变量必须是【有效final的】。

备注：从Java 8 开始，只有局部变量事实不必，那么final可以省略。
原因:
1、new出来的对象在堆当中。
2、局部变量是跟着方法走的，在栈内存中。
3、方法运行结束后，立刻出栈，局部变量就会消失。
4、但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。
 */
public class MyOuter {
    public void metodOuter(){
        int num =10;

        class MyInner{
            public void methodInner() {
                System.out.println(num);
            }
        }
    }
}
