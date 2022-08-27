package priv.lhf.jdbctemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlReturnResultSet;
import priv.lhf.datasource.utils.JDBCUtils;
import priv.lhf.domain.Emp;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * 练习
 * 1. 修改1号的工资
 * 2. 添加一条记录
 * 3. 删除添加的记录
 * 4. 查询id为1的并封装为Map
 * 5. 查询所有记录，封装为List集合
 * 6. 查询所有记录，封装为Emp对象的List集合
 * 7. 查询总记录数
 */
public class JdbcTemplateDemo2 {

    //Junit单元测试
    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 1. 修改1号的工资
     */
    @Test
    public void test1(){

        //2. 定义sql
        String sql = "update emp set salary = 25000 where id = 1";
        //3. 执行sql
        int count = template.update(sql);
        System.out.println(count);
    }

    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2(){
        String sql = "insert into emp(id, name, age, salary, dept_id) values(?, ?, ?, ?, ?)";
        int count = template.update(sql, 18, "白眉鹰王", 88, 24000, 1);
        System.out.println(count);
    }

    /**
     * 3. 删除添加的记录
     */
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int count = template.update(sql, 18);
        System.out.println(count);
    }

    /**
     * 4. 查询id为1的并封装为Map
     * 注意: 查询的结果集只能是1
     */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";
        //String sql = "select * from emp where id = ? or id = ?";
        //Map<String, Object> map = template.queryForMap(sql, 1, 2);
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
        //{id=1, name=金庸, age=66, job=总裁, salary=25000, entrydate=2000-01-01, managerid=null, dept_id=5}
    }

    /**
     * 5. 查询所有记录，封装为List集合
     * 注意: 将每一条查询记录封装为一个Map集合，在将Map集合装载到List集合中
     */
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> obj : list) {
            System.out.println(obj);
        }
    }

    /**
     * 6. 查询所有记录，封装为Emp对象的List集合
     */
    @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String job = resultSet.getString("job");
                int salary = resultSet.getInt("salary");
                Date entrydate = resultSet.getDate("entrydate");
                int managerid = resultSet.getInt("managerid");
                int dept_id = resultSet.getInt("dept_id");

                emp.setId(id);
                emp.setName(name);
                emp.setJob(job);
                emp.setAge(age);
                emp.setSalary(salary);
                emp.setEntryDate(entrydate);
                emp.setManagerId(managerid);
                emp.setDeptId(dept_id);

                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
    @Test
    public void test6_2(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }


    /**
     * 7. 查询总记录数
     */
    @Test
    public void test7(){
        String sql = "select count(id) from emp";
        Long count = template.queryForObject(sql, Long.class);
        System.out.println(count);
    }
}
