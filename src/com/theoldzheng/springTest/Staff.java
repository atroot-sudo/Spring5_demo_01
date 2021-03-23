package com.theoldzheng.springTest;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 17:54
 */
public class Staff {
    private String name;
    private int age;
    private Dept dept;

    public Staff(String name, int age, Dept dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Dept getDept() {
        return dept;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                '}';
    }
}
