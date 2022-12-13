package com.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public static List<Employee> getEmployee()
	{
	
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(107,"priya","SE",50000));
	list.add(new Employee(101,"shama","ASE",60000));
	list.add(new Employee(105,"neha","SE",30000));
	list.add(new Employee(102,"shubham","TL",40000));
	list.add(new Employee(103,"lavish","TP",80000));
	list.add(new Employee(104,"pranav","SE",90000));
	
	return list;
	}

}
