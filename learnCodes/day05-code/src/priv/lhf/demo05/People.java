package priv.lhf.demo05;
/*
对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样不可改变。

1、由于成员变量具有默认值，所以使用了final之后必须手动赋值，不在提供默认值。
2、对于final的成员变量，要么直接赋值，要么通过构造方法赋值。二者选其一。
3、必须保证类当中的使用重载方法。都会对final的成员变量赋值。
 */
public class People {
    public People() {
        name = "张三";
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
/*
    public void setName(String name) {
        this.name = name;
    }*/

    private final String name/* = "张三"*/;
}
