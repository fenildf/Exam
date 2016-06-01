package cn.exam.www.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.exam.www.base.BaseDao;
import cn.exam.www.base.BaseServiceImpl;
import cn.exam.www.domain.Question;
import cn.exam.www.service.QuestionService;

@Service("questionService")
public class QuestionServiceImpl extends BaseServiceImpl<Question> implements
		QuestionService {

	@Resource(name="questionDao")
	public void setDao(BaseDao<Question> dao) {
		super.setDao(dao);
    }
	
}
