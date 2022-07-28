package priv.lhf.demo04;
/*
如何才能指定一个父类引用的对象，本来是什么子类
格式：
对象 instanceof 类名称
结果得到一个boolean值的结果，也就是判断前面的对象能不能转化成后面的对象。
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        //animal.eat();

//        if(animal instanceof Dog)
//        {
//            Dog dog = (Dog) animal;
//            dog.eat();
//            dog.watchHouse();
//        }
//        if(animal instanceof Cat)
//        {
//            Cat cat = (Cat) animal;
//            cat.eat();
//            cat.catchMouse();
//        }
        giveMeAPet(animal1);
        giveMeAPet(animal2);

    }

    public static void giveMeAPet(Animal animal)
    {
        if(animal instanceof Dog)
        {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if(animal instanceof Cat)
        {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
