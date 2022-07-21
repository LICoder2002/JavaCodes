package priv.lhf.demo2;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("张三",20);
        System.out.println("姓名：" +student.getName() + " 年龄：" + student.getAge() );
    }
}
