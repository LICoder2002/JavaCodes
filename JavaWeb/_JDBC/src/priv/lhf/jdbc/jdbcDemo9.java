package priv.lhf.jdbc;

import priv.lhf.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * 练习:
 *  1. 通过键盘录入用户名和密码
 *  2. 判断是否登录成功
 */
public class jdbcDemo9 {

    public static void main(String[] args) {
        //1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String username = sc.nextLine();
        System.out.println("请输入密码: ");
        String password = sc.nextLine();

        //2. 调用方法
        boolean flag = new jdbcDemo9().login2(username, password);

        //3. 判断结果
        if(flag){
            System.out.println("登陆成功!");
        }else {
            System.out.println("用户名或密码错误！");
        }
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public boolean login(String username, String password){
        if(username == null || password == null){
            return false;
        }

        //连接数据库判断是否登录成功
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //1. 获取连接
            connection = JDBCUtils.getConnection();
            //2. 定义sql
            String sql = "select * from users where username = '"+ username +"' and password = '"+ password +"'";
            //3. 获取执行sql对象
            statement = connection.createStatement();
            //4. 执行查询
            resultSet = statement.executeQuery(sql);
            //5. 判断
            return resultSet.next();//如果有下一行， 则返回true

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(resultSet, statement, connection);
        }
        return false;
    }


    /**
     * 登录方法，使用PreparedStatement实现
     * @param username
     * @param password
     * @return
     */
    public boolean login2(String username, String password){
        if(username == null || password == null){
            return false;
        }

        //连接数据库判断是否登录成功
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            //1. 获取连接
            connection = JDBCUtils.getConnection();
            //2. 定义sql
            String sql = "select * from users where username = ? and password = ?";
            //3. 获取执行sql对象
            preparedStatement = connection.prepareStatement(sql);
            //给？赋值
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            //4. 执行查询
            resultSet = preparedStatement.executeQuery();
            //5. 判断
            return resultSet.next();//如果有下一行， 则返回true

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(resultSet, preparedStatement, connection);
        }
        return false;
    }
}
