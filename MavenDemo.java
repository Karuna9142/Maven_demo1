package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
class Employee
{
	@Id
  private int id;
  private String name;
  private double salary;
  private String department;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, double salary, String department) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
  
  
  
}

class MavenDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
	
		Employee  e1 = new Employee();
		Employee  e2 = new Employee();
		e1.setId(10);
		e1.setName("Karuna");
		e1.setSalary(15000.0);
		e1.setDepartment("Finance");
		
		
		e2.setId(10);
		e2.setName("Karuna");
		e2.setSalary(15000.0);
		e2.setDepartment("Finance");
		
		s.save(e1);
		s.save(e2);
		
		t.commit();
		s.close();

	}

}
