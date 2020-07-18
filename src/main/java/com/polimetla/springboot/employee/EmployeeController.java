package com.polimetla.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<Employee> getAllEmployees() {
         System.out.println("Inside get All employee method");
        try{
            return employeeService.getAllEmployees();
         } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    @RequestMapping("/home")
    public String getHomePage() {
        return "Welcome to AWS Fargate Portal";
    }

    @RequestMapping("/employee/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        System.out.println("Inside get method employeeid");
        try{
        return employeeService.getEmployeeById(employeeId);
         } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public void createEmployee(@RequestBody Employee employee) {
        System.out.println("Inside post method");
        try{
            employeeService.createEmployee(employee);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/{employeeId}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int employeeId) {
         System.out.println("Inside update method");
        try{
                employeeService.updateEmployee(employee, employeeId);
             } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
         System.out.println("Inside delete method");
        try{
                 employeeService.deleteEmployee(employeeId);
             } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
