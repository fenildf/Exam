package cn.exam.www.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.exam.www.base.BaseDao;
import cn.exam.www.base.BaseServiceImpl;
import cn.exam.www.domain.QueType;
import cn.exam.www.service.QueTypeService;

@Service("queTypeService")
public class QueTypeServiceImpl extends BaseServiceImpl<QueType> implements
		QueTypeService {

	@Resource(name="queTypeDao")
	public void setDao(BaseDao<QueType> dao) {
		super.setDao(dao);
    }
}
