package annotation;

import java.util.Date;

/**
 * JDK中预定义的一些注解
 *  * @override：检测被该注解标注的方法是否继承自父亲
 *  * @Deprecated: 该注解标注的内容，表示已过时
 *  * @SuppressWarnings：压制警告
 */

@SuppressWarnings("all")
public class AnnotationDemo02 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //代替show1方法
    }

    public void demo(){
        show1();

        Date date = new Date();
    }
}
