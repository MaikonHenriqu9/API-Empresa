package com.devsuperior.userdep.controllers;


import com.devsuperior.userdep.entities.Department;
import com.devsuperior.userdep.entities.User;
import com.devsuperior.userdep.refatories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    // Pega todas as informações do  tabela departamento
    @GetMapping
    public List<Department> findAll(){
        List<Department> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Department findById(@PathVariable Long id){
        Department result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Department insert(@RequestBody Department department){
        Department result = repository.save(department);
        return result;
    }

    @PutMapping
    public Department update(@RequestBody Department department){
        Department result = repository.save(department);
        return result;
    }

}
