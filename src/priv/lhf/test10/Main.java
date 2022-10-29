package priv.lhf.test10;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Person> list = new LinkedList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name;
            int age;
            name = sc.next();
            age = sc.nextInt();
            list.add(new Person(name, age));

        }

        String name;
        int age;
        name = sc.next();
        age = sc.nextInt();

        Iterator<Person> iterator = list.iterator();
        System.out.println("排序前:");
        while (iterator.hasNext())
        {
            Person p = iterator.next();
            System.out.println(p.toString());
        }

        Collections.sort(list);
        System.out.println("排序后:");
        iterator = list.iterator();
        while (iterator.hasNext())
        {
            Person p = iterator.next();
            System.out.println(p.toString());
        }

        Person p = new Person(name, age);
        int index = -1;
        index = Collections.binarySearch(list, p, null);
        if(index!=-1)
            System.out.println(index);
        else
            System.out.println( "null");
    }
}

class Person implements Comparable<Person>{

    String name;
    int age;

    @Override
    public String toString() {
        return "Person [" +
                "name=" + name +
                ",age=" + age +
                ']';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        Person p = (Person) o;
        return this.age - p.age;
    }
}