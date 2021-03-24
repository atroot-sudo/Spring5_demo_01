package com.theoldzheng.annotation.UserServices;

import com.theoldzheng.annotation.DAO.UserDAO;
import com.theoldzheng.annotation.DAO.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 16:16
 */
@Service
public class UserService {
    //定义属性不需要添加set()方法
    //在属性上边写注解 Autowired表示根据属性进行自动包装注入
    @Autowired
//    @Qualifier(value = "userDAOImpl")
//    @Resource //可以根据属性注入  也可以根据名称  是javaX包下的 spring官方不推荐使用
//    @Resource(name = "userDAOImpl")
//    @Value("直接将要注入的属性值写到这里")
    private UserDAO userDAO;


    public void add(){
        System.out.println("Service add....");
        userDAO.add();
    }
}
