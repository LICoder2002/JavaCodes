package annotation;

import domain.Person;

/**
 * 格式:
 *  元注解 用于表述注解的注解
 *      * @Target: 描述注解能够作用的位置
 *      * @Retention: 描述注解被保留的阶段
 *      * @Documented: 描述注解是否被抽取到API文档中
 *      * @Inherited: 描述注解是否被子类继承

 *  public @interface 注解名称{}

 * 本质:
 *  public interface MyAnnotation extends java.lang.annotation.Annotation{}

 *  属性: 接口中的抽象方法
 *      要求:
 *      1. 返回值类型
 *          * 基本数据类型
 *          * String
 *          * 枚举
 *          * 注解
 *          * 以上类型的数组

 *      2. 定义了属性，在使用时需要赋值
 *          如果使用default关键字 给属性默认赋值， 使用时可以不赋值
 *          如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可
 */
public @interface MyAnnotation {

    int show1();
    String show2();
    //void show2();
    //Person per();

    String[] strs();

}
