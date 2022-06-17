package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.Department;
import com.infy.dto.DepartmentDTO;
import com.infy.dto.Employee;
import com.infy.dto.EmployeeDTO;
import com.infy.service.EmployeeService;

@SpringBootApplication
public class MappingProjectApplication implements CommandLineRunner {
	
	@Autowired
	EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(MappingProjectApplication.class, args);
	}
	

   @Override
	public void run(String... args) throws Exception {
		addEmployee();
		
	}
   public void addEmployee() {
		DepartmentDTO deptdto= new DepartmentDTO(100,"Sales");
		EmployeeDTO dto= new EmployeeDTO(1,"Ankit",9000,deptdto);
		service.addEmployee(dto);	
		
	}

}
