
  
// Importing package in this code module 
package com.java.interview.Controller;   
// Importing required classes 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
  
// Annotation 
@RestController
@RequestMapping("employeeDetails")
public class EmployeeController { 

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    Employee employee;

    employeeService.getSignedCopy(employee);
  
    
}
