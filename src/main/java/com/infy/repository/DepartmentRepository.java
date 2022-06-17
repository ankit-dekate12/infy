package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
