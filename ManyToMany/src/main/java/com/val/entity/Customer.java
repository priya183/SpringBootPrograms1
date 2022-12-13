package com.val.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	//used to give specific(desired) table name
	@JoinTable(name="customer_item_table",
	joinColumns= {
			@JoinColumn(name="customer_fk")
			},
	inverseJoinColumns= {
			@JoinColumn(name="item_fk")
			})
	private Set<Item> item=new HashSet<>();

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

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

	public Customer(int id, String name, Set<Item> item) {
		super();
		this.id = id;
		this.name = name;
		this.item = item;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", item=" + item + "]";
	}
	
	
}