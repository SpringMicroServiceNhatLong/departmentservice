package com.departmentservice.repository;

import com.departmentservice.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
