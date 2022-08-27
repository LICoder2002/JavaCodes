package priv.lhf.domain;

import java.util.Date;

/**
 * 封装Emp表数据的JavaBean
 */
public class Emp {
    private Integer id;
    private String name;
    private Integer age;
    private String job;
    private Integer salary;
    private Date entryDate;
    private Integer managerId;
    private Integer deptId;

    public Emp() {
    }

    public Emp(Integer id, String name, Integer age, String job, Integer salary, Date entryDate, Integer managerId, Integer deptId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.entryDate = entryDate;
        this.managerId = managerId;
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", entryDate=" + entryDate +
                ", managerId=" + managerId +
                ", deptId=" + deptId +
                '}';
    }
}
