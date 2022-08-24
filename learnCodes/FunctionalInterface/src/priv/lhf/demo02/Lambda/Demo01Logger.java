package priv.lhf.demo02.Lambda;
/*
    日志案例


 */
public class Demo01Logger {
    //定义一个根据日志的级别，显示日志的方法
    public static void showLog(int level, String message){
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello ";
        String msg2 = "World ";
        String msg3 = "Java ";

        showLog(1, msg1 + msg2 + msg3);
    }
}
