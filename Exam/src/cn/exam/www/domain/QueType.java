package cn.exam.www.domain;

import java.util.Set;

/**
 * 试题类型实体类
 * @author Administrator
 *
 */
public class QueType {
	private Long id;
	private Set<Question> questions;
	private String name;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
