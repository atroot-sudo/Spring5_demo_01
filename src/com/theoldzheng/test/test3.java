package com.theoldzheng.test;

import com.theoldzheng.springTest2.Book;
import com.theoldzheng.springTest2.Course;
import com.theoldzheng.springTest2.MyBean;
import com.theoldzheng.springTest2.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 19:58
 */
public class test3 {
    @Test
    public void test1(){

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean4.xml");
        Person person1 = applicationContext1.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println("************");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
        System.out.println("************");

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("bean6.xml");

        Course test = applicationContext2.getBean("test", Course.class);
        System.out.println(test);


    }
}
