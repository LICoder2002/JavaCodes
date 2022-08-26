package priv.lhf.jdbc;

import priv.lhf.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 事务操作
 */
public class jdbcDemo10 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;

        try {
            //1.获取连接
            connection = JDBCUtils.getConnection();

            //开启事务
            connection.setAutoCommit(false);

            //2. 定义sql
            //张三-500
            String sql1 = "update account set money = money - ? where id = ?";
            //李四+500
            String sql2 = "update account set money = money + ? where id = ?";
            //3.获取执行sql对象
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);
            //4. 设置参数
            preparedStatement1.setInt(1, 500);
            preparedStatement1.setInt(2, 1);

            preparedStatement2.setInt(1, 500);
            preparedStatement2.setInt(2, 2);

            //5. 执行sql
            preparedStatement1.executeUpdate();

            //设置异常
            //int i = 3/0;

            preparedStatement2.executeUpdate();

            //提交事务
            connection.commit();

        } catch (Exception e) {
            //事务的回滚
            try {
                if(connection!=null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(preparedStatement1, connection);
            JDBCUtils.close(preparedStatement2, null);
        }
    }
}
