package com.theoldzheng.springTest.UserService;

import com.theoldzheng.springTest.UserDAO.UserDAO;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.23 13:07
 */
public class UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }



    public void add() {
        System.out.println("UserService is coming!");
        userDAO.add();
    }
}
