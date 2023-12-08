package com.devsuperior.userdep.refatories;

import com.devsuperior.userdep.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
