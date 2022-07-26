package priv.lhf.test2;
/*
方法覆盖重写注意事项：
1. 必须保证父子类之间方法的名称相同，参数列表也相同。
@Override：写在方法前面，用来检测是不是有效的重写。

2. 子类方法返回值必须【小于或者等于】父类方法的返回值范围。
提示：java.lang.Object类是所有类的公共最高父类（祖先类），java.lang.String就是Object的子类

3. 子类的方法权限必须【大于或等于】父类方法的权限修饰符。
public > protected > (default) > private
备注：（default）不是关键字default，而是什么都不写，留空。

 */

public class Fu {
    public void method()
    {
        System.out.println("方法执行");
    }
}
