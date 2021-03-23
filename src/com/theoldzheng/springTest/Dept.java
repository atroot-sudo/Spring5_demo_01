package com.theoldzheng.springTest;

/**
 * Description:部门
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 17:53
 */
public class Dept {
    private String name;

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }

    public Dept() {
    }

    public Dept(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
