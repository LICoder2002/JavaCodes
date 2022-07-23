package priv.lhf.test2;

import java.util.Random;
import java.util.Scanner;

public class Demo01RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int RandomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true)
        {
            count++;
            if(count>10)
            {
                System.out.println("很遗憾，你猜测的次数已超过 10 次！");
                break;
            }
            System.out.println("请输入你要猜测的数字：");
            int guessNum = sc.nextInt();
            if(guessNum > RandomNum)
            {
                System.out.println("猜大了");
            }
            else if(guessNum < RandomNum)
            {
                System.out.println("猜小了");
            }
            else
            {
                System.out.println("恭喜你，猜中了！共猜了"+count +"次。");
                break;
            }
        }
    }
}
