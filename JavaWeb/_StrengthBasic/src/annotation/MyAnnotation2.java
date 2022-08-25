package annotation;

import java.lang.annotation.*;

/**
 *  元注解 用于表述注解的注解
 *      * @Target: 描述注解能够作用的位置
 *          TYPE: 作用于类上
 *          METHOD: 作用于方法上
 *          FIELD: 作用于成员变量上

 *      * @Retention: 描述注解被保留的阶段
 *      *  @Retention(RetentionPolicy.RUNTIME): 当前被描述的注解，会保留到class字节码文件中，并被JVW读取到
 *      * @Documented: 描述注解是否被抽取到API文档中
 *      * @Inherited: 描述注解是否被子类继承
 *
 */
@Target( {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) //表示MyAnnotation2注解只能作用于类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation2 {
}
