package priv.lhf.demo03.Generic;
/*
    含有泛型的接口，第二种使用方法：接口使用什么泛型，实现类就使用什么泛型
    例如：
    public interface List<E>
    {
        boolean add(E e);
        E get(int index);
    }

    public class ArrayList<E> implements List<E>{
        public boolean add(E e){}
        public E get(int index){}
    }

*/

public class GenericInterfaceImpl2<I> implements GenericInterface<I> {

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
