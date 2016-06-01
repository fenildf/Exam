package cn.exam.www.domain;

import java.util.Set;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {
	private Long id;
	private Set<Paper> papers;
	private String name;
	private String password;
	private String department;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Set<Paper> getPapers() {
		return papers;
	}
	public void setPapers(Set<Paper> papers) {
		this.papers = papers;
	}
	
	
}
