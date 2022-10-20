package com.example.springdemo.service;

import com.example.springdemo.model.Employee;
import com.example.springdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    public List<Employee> listAll() {
        return repo.findAll();
    }

    public Employee get(int id) {
        return repo.findById(id).get();
    }


}
