package cn.exam.www.struts2.action;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.exam.www.base.BaseAction;
import cn.exam.www.domain.User;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2778589526482779675L;
	
	/**
	 * 查询所有列表页
	 * @return
	 */
	public String list() {
		List<User> userList = userService.findAll();
		ActionContext.getContext().put("userList", userList);
		return "list";
	}
	
	/**
	 * 删除页面
	 * @return
	 */
	public String delete(){
		userService.delete(model.getId());
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
		model.setPassword(DigestUtils.md5Hex("123456"));
		userService.save(model);
		return "toList";
	}
	
	/**
	 * 修改页面
	 * @return
	 */
	public String editUI(){
		//根据id获得Subject,并放在栈顶
		User user=userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);;
		return "editUI";
	}
	
	/**
	 * 修改
	 * @return
	 */
	public String edit(){
		userService.update(model);
		return "toList";
	}
	
	/**
	 * 初始化密码
	 * @return
	 */
	public String initPassWord(){
		//根据id 获得User
		User user=userService.getById(model.getId());
		//初始化密码为123456
		user.setPassword(DigestUtils.md5Hex("123456"));
		//保存
		userService.update(user);
		return "toList";
	}
	
	/*修改密码的功能留着
	 * public String editPassWordUI(){
		return "editPassWordUI";
	}
	
	public String editPassWord(){
		return "";
	}*/

}
