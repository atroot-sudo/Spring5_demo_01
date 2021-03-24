

import com.theoldzheng.springTest.Staff;
import com.theoldzheng.springTest3.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 9:17
 */
public class test4 {
    @Test
    public void test1(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        Orders order = applicationContext.getBean("order", Orders.class);

        System.out.println("4.对象已获取到!");
        applicationContext.close();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        Orders order = applicationContext.getBean("order", Orders.class);

        System.out.println("6.对象已获取到!");
        applicationContext.close();
    }
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean7.xml");
        Staff test = applicationContext.getBean("test", Staff.class);
        System.out.println(test);
    }
}
