package cn.exam.www.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.exam.www.base.BaseDao;
import cn.exam.www.base.BaseServiceImpl;
import cn.exam.www.domain.User;
import cn.exam.www.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements
		UserService {

	@Resource(name="userDao")
	public void setDao(BaseDao<User> dao) {
		super.setDao(dao);
    }
}
