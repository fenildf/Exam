package cn.exam.www.struts2.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.exam.www.base.BaseAction;
import cn.exam.www.domain.QueType;
import cn.exam.www.domain.Question;
import cn.exam.www.domain.Subject;
import cn.exam.www.domain.User;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class QuestionAction extends BaseAction<Question> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6634037204380104667L;
	
	private Long queTypeId;
	private Long subjectId;

	/**
	 * 查询所有列表页
	 * 
	 * @return
	 */
	public String list() {
		List<Question> questionList = questionService.findAll();
		ActionContext.getContext().put("questionList", questionList);
		return "list";
	}

	/**
	 * 删除页面
	 * 
	 * @return
	 */
	public String delete() {
		questionService.delete(model.getId());
		return "toList";
	}

	/**
	 * 添加页面
	 * 
	 * @return
	 */
	public String addUI(){
		//查询试题类别
		List<QueType> queTypeList=queTypeService.findAll();
		//将questionList放在Map中
		ActionContext.getContext().put("queTypeList", queTypeList);
		//查询科目
		List<Subject> subjectList=subjectService.findAll();
		//将questionList放在Map中
		ActionContext.getContext().put("subjectList", subjectList);
		//查询科目
		List<User> userList=userService.findAll();
		//将questionList放在Map中
		ActionContext.getContext().put("userList", userList);
		return "addUI";
	}

	/**
	 * 添加
	 * 
	 * @return
	 */
	public String add() {
		//根据queTypeId获得QueType
		QueType queType=queTypeService.getById(queTypeId);
		Subject subject=subjectService.getById(subjectId);
		model.setQueType(queType);
		model.setSubject(subject);
		//设置时间
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		model.setDate(format.format(new Date()));
		questionService.save(model);
		return "toList";
	}

	/**
	 * 修改页面
	 * 
	 * @return
	 */
	public String editUI() {
		// 根据id获得Subject,并放在栈顶
		Question question = questionService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(question);
		;
		return "editUI";
	}

	/**
	 * 修改
	 * 
	 * @return
	 */
	public String edit() {
		questionService.update(model);
		return "toList";
	}

	
	
	public Long getQueTypeId() {
		return queTypeId;
	}

	public void setQueTypeId(Long queTypeId) {
		this.queTypeId = queTypeId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	
	
}
