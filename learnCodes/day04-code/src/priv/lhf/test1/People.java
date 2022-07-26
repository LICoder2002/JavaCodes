package priv.lhf.test1;

public class People {

    int age = 20;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public People() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public  void method()
    {

        System.out.println("方法执行");
    }
}
