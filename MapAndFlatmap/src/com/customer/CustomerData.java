package com.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerData {
	
	public static List<Customer> getAll()
	{
		List<Customer> list=new ArrayList<>();
		list.add(new Customer(1, "priya","priya@gmail.com",Arrays.asList("12345","12443")));
		list.add(new Customer(2, "shama","shama@gmail.com",Arrays.asList("33456","87654")));
		list.add(new Customer(3, "megha","megha@gmail.com",Arrays.asList("98765","23456")));
		list.add(new Customer(4, "sneha","sneha@gmail.com",Arrays.asList("76545","98765")));
		list.add(new Customer(5, "mayura","aman@gmail.com",Arrays.asList("67564","65748")));
		list.add(new Customer(6, "rohan","rohan@gmail.com",Arrays.asList("35467","45653")));
		return list;
	}

}
