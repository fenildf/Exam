package cn.exam.www.dao.impl;

import org.springframework.stereotype.Repository;

import cn.exam.www.base.BaseDaoImpl;
import cn.exam.www.dao.UserDao;
import cn.exam.www.domain.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	
}
