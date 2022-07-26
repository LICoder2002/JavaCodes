package priv.lhf.demo;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        Member four = new Member("成员D", 0);

        manager.show(); // 100
        one.show();  // 0
        two.show();  // 0
        three.show(); // 0
        four.show(); // 0
        System.out.println("====================");

        ArrayList<Integer> redList = manager.send(10,4);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);

        manager.show(); // 100 - 90
        one.show();
        two.show();
        three.show();
        four.show();
    }
}
