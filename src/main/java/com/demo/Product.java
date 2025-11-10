package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

 
@Component
 public class Product
{
	private int id;
	private String name;
	private String role;
	
	public Product()
	{
		
	}
	
	public Product(int id,String name,String role)
	{
		this.id=id;
		this.name=name;
		this.role=role;
		
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		
		this.id=id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}

