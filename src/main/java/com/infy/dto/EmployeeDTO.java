package com.infy.dto;

public class EmployeeDTO {
     int empId;
     String empName;
     int empSal;
     
     DepartmentDTO department;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(int empId, String empName, int empSal, DepartmentDTO department) {
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

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", department="
				+ department + "]";
	}

	
}
