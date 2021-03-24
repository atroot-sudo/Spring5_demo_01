import com.theoldzheng.springTest.Book;
import com.theoldzheng.springTest.Order;
import com.theoldzheng.springTest.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 9:53
 */
public class test {
    @Test
    public void test1() {
        //引入配置文件
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean1.xml");
        //以上IOC的实现方式通常用来给Spring内部使用，提供给程序员使用的有ApplicationContext的方式
        //两种方式在创建对象的时间上有不同：前者 在获取对象时，才会进行创建，后者加载配置文件时对象就会进行创建
        // 后者提供更强大的功能，ApplicationContext是BeanFactory接口的子接口，一般由开发人员使用

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml"); //对应到src目录下
//        applicationContext = new FileSystemXmlApplicationContext("bean1.xml");//需要精确到盘符的绝对路径

        //加载类
        Person user = applicationContext.getBean("user", Person.class);
        System.out.println(user);

        user.add();

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = applicationContext1.getBean("book", Book.class);
        System.out.println(book);

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = applicationContext2.getBean("order", Order.class);
        System.out.println(order);

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("bean1.xml");
        Book book1 = applicationContext3.getBean("book1", Book.class);

        System.out.println(book1);


        ApplicationContext applicationContext4 = new ClassPathXmlApplicationContext("bean1.xml");
        Book book2 = applicationContext4.getBean("book2", Book.class);

        System.out.println(book2);

    }
}
