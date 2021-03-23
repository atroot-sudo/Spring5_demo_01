package com.theoldzheng.springTest2;

import org.springframework.beans.factory.FactoryBean;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 21:55
 */
public class MyBean implements FactoryBean <Course>{

    @Override
    public Course getObject() throws Exception {
        Course course = Course.class.newInstance();


        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
