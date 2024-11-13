package com.example.springboot_MethodArgumentNotValidException;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class EmployeeController
{
    @Autowired
    EmployeeRepository erepo;

    @RequestMapping("/test")
    public String test()
    {
        return "Hello! This is Method Argument Not Valid Exception Springboot application";
    }
    @PostMapping("/save")
    public String SaveData(@Valid @RequestBody Employee emp)
    {
        erepo.save(emp);
        return "Data is saved ";
    }

    @GetMapping("/all")
    public List<Employee> allData()
    {
        return erepo.findAll();
    }

}
