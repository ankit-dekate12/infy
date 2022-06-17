package com.infy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.dto.Department;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public boolean addEmployee(EmployeeDTO dto) {
		
		Department dept=new Department();
		dept.setDeptId(dto.getDepartment().getDeptId());
		dept.setDeptName(dto.getDepartment().getDeptName());
			
		Employee emp=new Employee();
		emp.setEmpId(dto.getEmpId());	
		emp.setEmpName(dto.getEmpName());
		emp.setEmpSal(dto.getEmpSal());
		emp.setDepartment(dept);
		repository.save(emp);
		return true;
		
	}

}
