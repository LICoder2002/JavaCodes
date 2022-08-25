package test;

import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     *初始化方法:
     * 用于资源申请
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源
     * 自动执行
     */
    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd(){
        //int i = 2/0;
        //System.out.println("执行");
        Calculator c = new Calculator();
        int ret = c.add(1, 3);
//        System.out.println(c.add(1, 2));

        //断言
        Assert.assertEquals(4, ret);
    }

    @Test
    public void testSub(){
        //int i = 2/0;
        //System.out.println("执行");
        Calculator c = new Calculator();
        int ret = c.sub(1, 3);
//        System.out.println(c.add(1, 2));
        System.out.println("testSub...");
        //断言
        Assert.assertEquals(-2, ret);
    }
}
