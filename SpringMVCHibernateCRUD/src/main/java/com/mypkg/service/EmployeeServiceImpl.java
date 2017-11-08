package com.mypkg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.mypkg.dao.EmployeeDAO;
import com.mypkg.model.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	 @Autowired
	    private EmployeeDAO employeeDAO;
	 
	    @Transactional
	    public void addEmployee(Employee employee) {
	        employeeDAO.addEmployee(employee);
	    }
	 
	    @Transactional
	    public List<Employee> getAllEmployees() {
	        return employeeDAO.getAllEmployees();
	    }
	 
	    @Transactional
	    public void deleteEmployee(Integer employeeId) {
	        employeeDAO.deleteEmployee(employeeId);
	    }
	 
	    public Employee getEmployee(int empid) {
	        return employeeDAO.getEmployee(empid);
	    }
	 
	    public Employee updateEmployee(Employee employee) {
	        // TODO Auto-generated method stub
	        return employeeDAO.updateEmployee(employee);
	    }
	 
	    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
	        this.employeeDAO = employeeDAO;
	    }
}
