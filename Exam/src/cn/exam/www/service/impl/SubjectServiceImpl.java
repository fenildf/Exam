package cn.exam.www.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.exam.www.base.BaseDao;
import cn.exam.www.base.BaseServiceImpl;
import cn.exam.www.domain.Subject;
import cn.exam.www.service.SubjectService;

@Service("subjectService")
public class SubjectServiceImpl extends BaseServiceImpl<Subject> implements
		SubjectService {

	@Resource(name="subjectDao")
	public void setDao(BaseDao<Subject> dao) {
		super.setDao(dao);
    }
}
