package priv.lhf.jdbc;

import priv.lhf.domain.Emp;
import priv.lhf.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，查询emp表的数据将其封装为对象，任何装载集合，返回
 */
public class jdbcDemo8 {

    public static void main(String[] args) {
        List<Emp> list = new jdbcDemo8().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
    /**
     * 查询所有emp对象
     * @return List集合
     */
    public List<Emp> findAll() {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        List<Emp> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///itheima?useSSL=false", "root", "205011");
            //3. 定义sql
            String sql = "select * from emp";
            //4. 获取执行sql的对象
            statement = connection.createStatement();
            //5. 执行sql
            resultSet = statement.executeQuery(sql);
            //6. 遍历结果集 ，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String job = resultSet.getString("job");
                int salary = resultSet.getInt("salary");
                Date entrydate = resultSet.getDate("entrydate");
                int manageid = resultSet.getInt("managerid");
                int dept_id = resultSet.getInt("dept_id");
                //创建emp对象
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setJob(job);
                emp.setSalary(salary);
                emp.setManageId(manageid);
                emp.setDeptId(dept_id);
                emp.setEntryDate(entrydate);

                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (statement != null) {
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
        return list;
    }

    /**
     * 演示JDBC工具类
     * @return List集合
     */
    public List<Emp> findAll2() {
        ResultSet resultSet = null;
        Statement statement = null;
        Connection connection = null;
        List<Emp> list = null;
        try {
            /*  //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///itheima?useSSL=false", "root", "205011");*/

            connection = JDBCUtils.getConnection();

            //3. 定义sql
            String sql = "select * from emp";
            //4. 获取执行sql的对象
            statement = connection.createStatement();
            //5. 执行sql
            resultSet = statement.executeQuery(sql);
            //6. 遍历结果集 ，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String job = resultSet.getString("job");
                int salary = resultSet.getInt("salary");
                Date entrydate = resultSet.getDate("entrydate");
                int manageid = resultSet.getInt("managerid");
                int dept_id = resultSet.getInt("dept_id");
                //创建emp对象
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setJob(job);
                emp.setSalary(salary);
                emp.setManageId(manageid);
                emp.setDeptId(dept_id);
                emp.setEntryDate(entrydate);

                list.add(emp);
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            /*if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (statement != null) {
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
            }*/

            JDBCUtils.close(resultSet, statement, connection);
        }
        return list;
    }
}
