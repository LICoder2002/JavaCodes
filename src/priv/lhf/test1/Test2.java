package priv.lhf.test1;

import java.util.Scanner;

/**
 * sdut-sel-2 汽车超速罚款（选择结构）
 * 在一行内输入2个整数。第一个表示速度的限制，第二个表示司机的开车速度。

 * 如果司机没有超速，输出应该是：Congratulations, you are within the speed limit!
 * 如果司机超速行驶，输出为：You are speeding and your fine is F.（F为上表中描述的罚款数额）
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a >= b)
            System.out.println("Congratulations, you are within the speed limit!");
        else{
            int sup = b - a;
            if(sup <= 20)
            {
                System.out.println("You are speeding and your fine is 100");
            }
            else if(sup <= 30)
                System.out.println("You are speeding and your fine is 270");
            else
            {
                System.out.println("You are speeding and your fine is 500");
            }
        }
    }
}
