package priv.lhf.jdbc;

import java.sql.*;

/**
 * 执行DDL语句
 */
public class jdbcDemo6 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql:///itheima?useSSL=false", "root", "205011");
            //定义sql
            String sql = "select * from user";
            //获取执行sql的对象
            statement = connection.createStatement();
            //执行sql
            resultSet = statement.executeQuery(sql);

            //处理结果
            //1. 游标向下移动一行
            resultSet.next();
            //获取数据
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int status = resultSet.getInt("status");
            String gender = resultSet.getString("gender");

            System.out.println(id + "---" + name + "---" + age + "---" + status + "---" + gender);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
