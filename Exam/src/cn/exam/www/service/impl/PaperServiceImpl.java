package cn.exam.www.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.exam.www.base.BaseDao;
import cn.exam.www.base.BaseServiceImpl;
import cn.exam.www.domain.Paper;
import cn.exam.www.service.PaperService;

@Service("paperService")
public class PaperServiceImpl extends BaseServiceImpl<Paper> implements
		PaperService {

	@Resource(name="paperDao")
	public void setDao(BaseDao<Paper> dao) {
		super.setDao(dao);
    }
}
