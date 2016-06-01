package cn.exam.www.dao.impl;

import org.springframework.stereotype.Repository;

import cn.exam.www.base.BaseDaoImpl;
import cn.exam.www.dao.QuestionDao;
import cn.exam.www.domain.Question;

@Repository("questionDao")
public class QuestionDaoImpl extends BaseDaoImpl<Question> implements QuestionDao {

	
}
