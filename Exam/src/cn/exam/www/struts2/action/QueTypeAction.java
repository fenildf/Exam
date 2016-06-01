package cn.exam.www.struts2.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.exam.www.base.BaseAction;
import cn.exam.www.domain.QueType;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class QueTypeAction extends BaseAction<QueType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3079175251342500627L;

	/**
	 * 列表页
	 * 
	 * @return
	 */
	public String list() {
		List<QueType> queTypeList= queTypeService.findAll();
		ActionContext.getContext().put("queTypeList", queTypeList);
		return "list";
	}

	/**
	 * 删除页面
	 * 
	 * @return
	 */
	public String delete() {
		queTypeService.delete(model.getId());
		return "toList";
	}

	/**
	 * 添加页面
	 * 
	 * @return
	 */
	public String addUI() {
		return "addUI";
	}

	/**
	 * 添加
	 * 
	 * @return
	 */
	public String add() {
		queTypeService.save(model);
		return "toList";
	}

	/**
	 * 修改页面
	 * 
	 * @return
	 */
	public String editUI() {
		// 根据id获得Subject,并放在栈顶
		QueType queType = queTypeService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(queType);
		;
		return "editUI";
	}

	/**
	 * 修改
	 * 
	 * @return
	 */
	public String edit() {
		queTypeService.update(model);
		return "toList";
	}
}
