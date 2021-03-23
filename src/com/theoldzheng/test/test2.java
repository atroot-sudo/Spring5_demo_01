package com.theoldzheng.test;

import com.theoldzheng.UserService.UserService;
import com.theoldzheng.springTest.Staff;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 13:19
 */
public class test2 {
    @Test
    public void test1() {

        //注入属性--外部bean
        ApplicationContext applicationContextApplicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        //Service层调用DAO层实现
        UserService userService = applicationContextApplicationContext.getBean("UserService", UserService.class);
        userService.add();
        System.out.println("**************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Staff staff = applicationContext.getBean("staff", Staff.class);
        System.out.println(staff);
        System.out.println("**************");

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean3.xml");
        Staff staff1 = applicationContext1.getBean("staff1", Staff.class);
        System.out.println(staff1);
    }
}
