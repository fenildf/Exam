package cn.exam.www.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class BaseServiceImpl<T> implements BaseService<T> {
	
	private BaseDao<T> dao ;
	
	private Class<T> clazz ;
	
	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}

	//注入dao
	@Resource
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}
	public void save(T entity) {
		dao.save(entity);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	public void update(T entity) {
		dao.update(entity);
	}

	public T getById(Long id) {
		return dao.getById(id);
	}

	public List<T> getByIds(Long[] ids) {
		return dao.getByIds(ids);
	}

	public List<T> findAll() {
		return dao.findAll();
	}

}
