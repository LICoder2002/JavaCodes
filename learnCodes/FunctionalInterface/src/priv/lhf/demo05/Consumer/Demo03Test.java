package priv.lhf.demo05.Consumer;

import java.util.function.Consumer;

/*
    格式化打印信息
 */
public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2)
    {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"张三，男", "李四，女", "王五，男"};

        printInfo(arr,
                (m)->{
                    //切割
                    String name = m.split("，")[0];
                    System.out.print("姓名: " + name);
                },
                (m)->{
                    String sex = m.split("，")[1];
                    System.out.println(" 性别: " + sex);
                });
    }
}
