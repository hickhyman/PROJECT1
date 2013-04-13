package com.hibernate.chapter1;

import javax.persistence.Entity;
import javax.persistence.Id;

//otro
//para crear una tabla de esta clase
@Entity 
public class Employee {
	
	private int empId;
	private String empName;
	
	//primary key
	@Id
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	

}
