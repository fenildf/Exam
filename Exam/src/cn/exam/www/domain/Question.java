package cn.exam.www.domain;

import java.util.Set;

/**
 * 题库实体类
 * @author Administrator
 *
 */
public class Question {
	private Long id;
	private Subject subject;
	private QueType queType;
	private Set<Paper> papers;
	private String content;
	private String answer;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private Integer score;
	private String level;
	private String picture;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public QueType getQueType() {
		return queType;
	}
	public void setQueType(QueType queType) {
		this.queType = queType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	public String getOptionE() {
		return optionE;
	}
	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Set<Paper> getPapers() {
		return papers;
	}
	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}
	
	
}
