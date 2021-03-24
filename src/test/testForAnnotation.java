import com.theoldzheng.annotation.Book;
import com.theoldzheng.annotation.CompleteAnnotation.ConfigClass;
import com.theoldzheng.annotation.UserServices.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 15:18
 */
public class testForAnnotation {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean9.xml");
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
        System.out.println("*********");

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
