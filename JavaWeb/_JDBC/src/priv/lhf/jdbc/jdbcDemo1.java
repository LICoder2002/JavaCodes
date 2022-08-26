package priv.lhf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1. 导入驱动jar包

        //2. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3. 获取连接对象
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima", "root", "205011");
        Connection con = DriverManager.getConnection("jdbc:mysql:///itheima?useSSL=false", "root", "205011");
        //4. 定义sql语句
        String sql = "update user set age = 20 where id = 1";
        //5。 获取执行sql的对象
        Statement stmt = con.createStatement();
        //6. 执行sql
        int count = stmt.executeUpdate(sql);
        //7. 处理结果
        System.out.println(count);
        //8. 释放资源
        stmt.close();
        con.close();
    }

}
