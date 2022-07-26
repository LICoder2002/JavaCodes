package priv.lhf.test1;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.method();
        stu.setAge(10);
        System.out.println(stu.getAge());

        Teacher tea = new Teacher();
        tea.method();
    }
}
