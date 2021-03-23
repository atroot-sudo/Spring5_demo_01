package com.theoldzheng.springTest2;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 20:17
 */
public class Course {
    private String name;
    private int id;


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course() {
    }

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
