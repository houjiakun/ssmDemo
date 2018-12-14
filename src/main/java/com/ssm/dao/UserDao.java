/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

/**
 * 用户DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface UserDao {

    public List<User> findList(User user);

    public void insert(User user);

    public void update(User user);

    public void delete(User user);
}
