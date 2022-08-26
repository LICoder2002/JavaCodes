package priv.lhf.domain;

import java.util.Date;

/**
 * 封装Emp表数据的JavaBean
 */
public class Emp {
    private int id;
    private String name;
    private int age;
    private String job;
    private int salary;
    private Date entryDate;
    private int manageId;
    private int deptId;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", entryDate=" + entryDate +
                ", manageId=" + manageId +
                ", deptId=" + deptId +
                '}';
    }

    public Emp() {
    }

    public Emp(int id, String name, int age, String job, int salary, Date entryDate, int manageId, int deptId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;
        this.entryDate = entryDate;
        this.manageId = manageId;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public int getManageId() {
        return manageId;
    }

    public void setManageId(int manageId) {
        this.manageId = manageId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

}
