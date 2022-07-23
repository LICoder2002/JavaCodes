package priv.lhf.test3;
//社会主义核心价值观是社会主义核心价值体系的内核。
//        党的十八大提出，倡导富强、民主、文明、和谐，倡导自由、平等、公正、法治，倡导爱国、敬业、诚信、友善，积极培育和践行社会主义核心价值观。
//        富强、民主、文明、和谐是国家层面的价值目标；自由、平等、公正、法治是社会层面的价值取向，
//        爱国、敬业、诚信、友善是公民个人层面的价值准则，这24个字是社会主义核心价值观的基本内容。
//
//        小伙伴们注意了，我们以实际行动积极响应党中央的号召，通过编程来进一步理解和践行社会主义核心价值观。
//        任务是：根据用户的输入，分别打印不同层面的社会主义核心价值观。
//        1——“富强、民主、文明、和谐（国家层面）”，
//        2——“自由、平等、公正、法治（社会层面）”，
//        3——“爱国、敬业、诚信、友善（个人层面）”；
//        其他非0整数，则输出：“Input out of range!” ；
//        0——程序结束。
//        小伙伴们不仅要理解、会编程，还要在学习、工作、生活中积极践行噢！
//        为了建设新时代中国社会主义的强国，实现中华民族的伟大复兴，小伙伴们加油加油再加油！


import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            int n = sc.nextInt();
            if(n==1)
                System.out.println("富强、民主、文明、和谐（国家层面）");
            else if(n==2)
                System.out.println("自由、平等、公正、法治（社会层面）");
            else if(n==3)
                System.out.println("爱国、敬业、诚信、友善（个人层面）");
            else if(n==0)
                break;
            else
                System.out.println("Input out of range!");
        }
    }
}
