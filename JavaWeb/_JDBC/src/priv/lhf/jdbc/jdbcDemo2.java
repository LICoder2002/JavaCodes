package priv.lhf.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * user表 添加一条记录 insert语句
 */
public class jdbcDemo2 {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //定义sql
            String sql = "insert into user values(null, '赵云', 25, 0, '男')";
            //获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///itheima?useSSL=false", "root", "205011");
            //获取执行sql对象Statement
            statement = connection.createStatement();
            //执行sql
            int count = statement.executeUpdate(sql);
            //处理结果
            System.out.println(count);
            if(count > 0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {

            //释放资源
            if(statement!=null){
                try {
                    statement.close();
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
