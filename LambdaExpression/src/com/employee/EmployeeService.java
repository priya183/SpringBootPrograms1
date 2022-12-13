package com.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	//Employee which need o pay tax
	public List<Employee> eveluatetaxUsers()
	{
		return EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
	}
	
	public List<Employee> eveluatetaxUsers(String input)
	{
		/*if(input.equalsIgnoreCase("tax"))
		{
			return EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());
		}
		else
		{
			return EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()<50000).collect(Collectors.toList());
		}*/
		
		//ternary operator instead of if else
		
		return (input.equalsIgnoreCase("tax"))?
		
       EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList())
       :
      EmployeeDao.getEmployee().stream().filter(emp->emp.getSalary()<50000).collect(Collectors.toList());
		
		
	}
	
	public static void main(String[] args) {
		
		EmployeeService s=new EmployeeService();
		System.out.println(s.eveluatetaxUsers());
		System.out.println("**********************");
		System.out.println(s.eveluatetaxUsers("no tax"));
		
	}

}
