package com.theoldzheng.springTest2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Description:实现 数组、List、Map、Set 的注入
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 19:43
 */
public class Person {
    private String[] array;
    private List<String> stringList;
    private Map<String, Course> stringMap;
    private Set<String> stringSet;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Map<String, Course> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, Course> stringMap) {
        this.stringMap = stringMap;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "array=" + Arrays.toString(array) +
                ", stringList=" + stringList +
                ", stringMap=" + stringMap +
                ", stringSet=" + stringSet +
                '}';
    }
}
