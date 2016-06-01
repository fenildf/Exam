package cn.exam.www.struts2.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.exam.www.base.BaseAction;
import cn.exam.www.domain.Subject;

@Controller
@Scope("prototype")
public class SubjectAction extends BaseAction<Subject> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -199088538102251505L;

	/**
	 * 列表页
	 * @return
	 */
	public String list() {
		List<Subject> subjectList = subjectService.findAll();
		ActionContext.getContext().put("subjectList", subjectList);
		return "list";
	}
	
	/**
	 * 删除页面
	 * @return
	 */
	public String delete(){
		subjectService.delete(model.getId());
		return "toList";
	}

	/**
	 * 添加页面
	 * @return
	 */
	public String addUI(){
		return "addUI";
	}
	
	/**
	 *添加
	 * @return
	 */
	public String add(){
		subjectService.save(model);
		return "toList";
	}
	
	/**
	 * 修改页面
	 * @return
	 */
	public String editUI(){
		//根据id获得Subject,并放在栈顶
		Subject subject=subjectService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(subject);;
		return "editUI";
	}
	
	/**
	 * 修改
	 * @return
	 */
	public String edit(){
		subjectService.update(model);
		return "toList";
	}
}
