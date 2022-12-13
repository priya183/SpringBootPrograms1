package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@PostMapping("/add")
	public List<Customer> add(@RequestBody List<Customer> customer)
	{
		return customerRepo.saveAll(customer);
	}
	@GetMapping("/getAll")
	public List<Customer> getAll()
	{
		return customerRepo.findAll();
	}

}
/*
 * [{
    "name":"priya",
    "item":{
        "name":"laptop"
    }
},
    {
    "name":"shubham",
    "item":{
        "name":"watch"
    }
    }
]
*/
