package cn.exam.www.dao.impl;

import org.springframework.stereotype.Repository;
import cn.exam.www.base.BaseDaoImpl;
import cn.exam.www.dao.PaperDao;
import cn.exam.www.domain.Paper;


@Repository("paperDao")
public class PaperDaoImpl extends BaseDaoImpl<Paper> implements PaperDao {

	
}
