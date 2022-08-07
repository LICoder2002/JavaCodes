package priv.lhf.demo03.Generic;
/*
    定义一个含有泛型的类，模拟ArrayList集合

 */
public class GenericClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
