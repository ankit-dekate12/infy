package com.infy.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee_tbl")
public class Employee {
	@Id
	@Column(name="eId")
	int empId;
	@Column(name="eName",length = 20)
	String empName;
	@Column(name="eSal")
	int empSal;
	@OneToOne(cascade = CascadeType.ALL)
	Department department;
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, int empSal, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.department = department;
	}

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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department=" + department
				+ "]";
	}
	
	
	

}
