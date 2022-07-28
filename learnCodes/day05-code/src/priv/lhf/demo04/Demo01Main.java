package priv.lhf.demo04;

public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型：父类引用指向子类对象。
        Animal animal = new Cat(); //多态
        animal.eat();//猫吃鱼
//        animal.catchMouse();//错误写法

        //向下转型，进行“还原动作”。
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //错误的向下转型
        //java.lang.ClassCastException类转换异常
        //Dog dog = (Dog) animal;
    }
}
