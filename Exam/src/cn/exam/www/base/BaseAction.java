package cn.exam.www.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import cn.exam.www.service.PaperService;
import cn.exam.www.service.QueTypeService;
import cn.exam.www.service.QuestionService;
import cn.exam.www.service.SubjectService;
import cn.exam.www.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4648148836347669657L;
	
	@Resource
	protected PaperService paperService;
	
	@Resource
	protected QuestionService questionService;
	
	@Resource
	protected QueTypeService queTypeService;
	
	@Resource
	protected SubjectService subjectService;
	
	@Resource
	protected UserService userService;
	
	
	
	
	
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
