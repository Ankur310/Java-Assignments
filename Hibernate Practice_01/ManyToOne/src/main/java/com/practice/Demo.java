package com.practice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	 public static void main(String[] args) {
		 
		 EntityManagerFactory manager = Persistence.createEntityManagerFactory("empDetails");
		 
		 EntityManager em = manager.createEntityManager();
		 
		 
		 ///setting EMPLOYEE
		 Employee emp = new Employee();
		 emp.setEmpId(1);
		 emp.setEmpName("Ankur Singh");
		 
		 
		 Employee emp2 = new Employee();
		 emp2.setEmpId(2);
		 emp2.setEmpName("Satyam Singh"); 
		 
		 //setting PROJECTS
		 
		 Projects pr1 = new Projects();
		 pr1.setProjectsID(1);
		 pr1.setProjectName("Masai");
		 
		 
		 Projects pr2 = new Projects();
		 pr2.setProjectsID(2);
		 pr2.setProjectName("Ninja");
		 
		 
		 List<Employee> ls = new ArrayList<>();
		 ls.add(emp2);
		 ls.add(emp);
		 pr2.setEmployeeList(ls);
		 
		 List<Projects> lsp = new ArrayList<>();
		 lsp.add(pr1);
		 lsp.add(pr2);
		 
		 em.getTransaction().begin();
		 
		 em.persist(emp2);
		 em.persist(pr2);
		 em.persist(pr1);
		 em.persist(emp);
		 
		 em.getTransaction().commit();
		 
		 em.close();
		 
		 
		 
		 
	 }
}
