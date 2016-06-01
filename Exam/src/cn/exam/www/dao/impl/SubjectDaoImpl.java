package cn.exam.www.dao.impl;

import org.springframework.stereotype.Repository;

import cn.exam.www.base.BaseDaoImpl;
import cn.exam.www.dao.SubjectDao;
import cn.exam.www.domain.Subject;

@Repository("subjectDao")
public class SubjectDaoImpl extends BaseDaoImpl<Subject> implements SubjectDao {

	
}
