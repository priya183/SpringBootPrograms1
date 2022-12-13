package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.repo.CustomerRepository;

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
//One ToMany unidirectional
/*
 [{
    "name":"AA",
    "item":[
        {
        "name":"laptop"
           },
           {
        "name":"watch"
         }
         
    ]
},
{
    "name":"AA",
    "item":[{
        "name":"laptop"
           },
           {
        "name":"watch"
         }
    ]
}
]



//OnToMany and ManyToOne bidirectional

[{
    "name":"AA",
    "item":[
        {
        "name":"laptop",
        "customer":{
            "name":"Neha"
        }
           },
           {
        "name":"watch",
        "customer":{
            "name":"Mona"
        }
        
         }
         
    ]
},
{
    "name":"BB",
    "item":[{
        "name":"mouse",
        "customer":{
           "name":"shubham"
        }
           },
           {
        "name":"bag",
        "customer":
        {
            "name":"Rohan"
        }
         }
    ]
}
]


*/

