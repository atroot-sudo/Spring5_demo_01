package com.theoldzheng.annotation;

import org.springframework.stereotype.Component;

/**
 * Description: 基于注解的Bean管理<p>
 * Spring针对Bean管理中创建对象提供注解<p>
 * （1）@Component  组件注解，通用注解，被该注解描述的类将被IoC容器管理并实例化<p>
 * （2）@Service      语义注解，说明当前类是Service业务服务类，用于实现功能的最核心代码，通常这种类都是以xxxservice结尾<p>
 * （3）@Controller   语义注解，说明当前类是mvc应用中的控制器，用于接收用户的输入，调用Service的方法以及向客户端返回结果<p>
 * （4）@Repository   语义注解，说明当前类用于业务持久层，通常描述对应的Dao类，负责与数据库实现增删改查的Dao类<p>
 * * 上面四个注解功能是一样的，都可以用来创建bean实例
 *
 * 提供的属性注入的注解
 * //@Autowired 通过属性进行装配 1.把Service和DAO对象创建 2.在UserService端声明属性UserDAO 并添加注解Autowired
 * //@Qualifier 根据名称进行注入 1.要与Autowired配合使用，在属性下面加上
 * //@Resources 可以根据属性注入  也可以根据名称  是javaX包下的 spring官方不推荐使用
 * //@Resource(name = "userDAOImpl")
 * //@Value("直接将要注入的属性值写到这里")
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 15:08
 */
@Component(value = "book1")
public class Book {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
