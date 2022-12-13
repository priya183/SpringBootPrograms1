package com.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	//cascade ALL- whenever we create Customer that time the item will also saved
	@OneToOne(cascade=CascadeType.ALL)
	
	private Item item;
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
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Customer(int id, String name, Item item) {
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
