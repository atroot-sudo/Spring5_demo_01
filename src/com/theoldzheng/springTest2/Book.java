package com.theoldzheng.springTest2;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 20:56
 */
public class Book {
    List<String> stringList;

    @Override
    public String toString() {
        return "Book{" +
                "stringList=" + stringList +
                '}';
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
