package com.infy.dto;

public class DepartmentDTO {
	int deptId;
	String deptName;
	public DepartmentDTO() {
		super();
	}
	public DepartmentDTO(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DepartmentDTO [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	

}
