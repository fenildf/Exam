package cn.exam.www.base;

import java.lang.reflect.ParameterizedType;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4648148836347669657L;
	

	
	
	
	protected T model;
	
	@SuppressWarnings("unchecked")
	public BaseAction(){
		//获得model的类型信息
		ParameterizedType pt=(ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz=(Class<T>) pt.getActualTypeArguments()[0];
		//通过反射生成model实例
		try {
			model=(T) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public T getModel() {
		return model;
	}

}
