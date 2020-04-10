package it.gm.springboot_project01.dao;

import it.gm.springboot_project01.pojo.User;
import org.apache.ibatis.annotations.Insert;

/**
 * date:2020-04-10
 * author:zhangxiaoshuai
 */
public interface UserDao {
    @Insert("insert into tb_user (id,username,password) values (#{id},#{username},#{password})")
    int addUser(User user);
}
