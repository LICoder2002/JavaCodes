package priv.lhf.demo02.Lambda;
/*
    使用Lambda优化日志案例
    Lambda的特点: 延迟加载
    Lambda的使用前提: 必须存在函数式接口
 */
public class Demo02Lambda {
    //定义一个根据日志的级别，显示日志的方法
    public static void showLog(int level, MessageBuilder mb)
    {
        if(level == 1)
        {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello ";
        String msg2 = "World ";
        String msg3 = "Java ";

//        showLog(2, () -> {
//            return msg1 + msg2 + msg3;
//        });


        /*
            使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
            只有满足条件，日志的等级是1级
                才会调用接口MessageBuilder中的方法builderMessage
                才会进行字符串的拼接

            如果条件不满足，则不会执行调用接口MessageBuilder中的方法builderMessage
            所以不会存在性能的浪费
         */
        showLog(2, () -> {
            return msg1 + msg2 + msg3;
        });

    }
}
