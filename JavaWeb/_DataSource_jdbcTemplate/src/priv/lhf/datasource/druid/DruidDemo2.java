package priv.lhf.datasource.druid;

import priv.lhf.datasource.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         * 给account表添加记录
         */
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            //1.获取连接
            connection = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "insert into account values(null, ?, ?)";
            //3.获取执行sql对象
            preparedStatement = connection.prepareStatement(sql);
            //4.给？赋值
            preparedStatement.setString(1, "王五");
            preparedStatement.setInt(2, 3000);
            //5.执行sql
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(preparedStatement, connection);
        }
    }
}
