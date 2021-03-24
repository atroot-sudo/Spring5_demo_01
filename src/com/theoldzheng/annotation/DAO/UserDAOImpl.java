package com.theoldzheng.annotation.DAO;

import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.24 16:13
 */
@Repository
public class UserDAOImpl implements UserDAO{
    @Override
    public void add() {
        System.out.println("UserDAOImpl add....");
    }
}
