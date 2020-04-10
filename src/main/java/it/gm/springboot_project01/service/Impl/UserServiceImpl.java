package it.gm.springboot_project01.service.Impl;

import it.gm.springboot_project01.dao.UserDao;
import it.gm.springboot_project01.pojo.User;
import it.gm.springboot_project01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * date:2020-04-10
 * author:zhangxiaoshuai
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
