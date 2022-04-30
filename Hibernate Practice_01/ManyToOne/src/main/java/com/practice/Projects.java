package com.practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	private int projectsID;
	private String projectName;
	
	@ManyToMany
	List<Employee> employeeList;

	public int getProjectsID() {
		return projectsID;
	}

	public void setProjectsID(int projectsID) {
		this.projectsID = projectsID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
	
	

}
