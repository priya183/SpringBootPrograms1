package com.val.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="item")
	private Set<Customer> customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, Set<Customer> customer) {
		super();
		this.id = id;
		this.name = name;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", customer=" + customer + "]";
	}
	
	

}
