package com.demo;

public class ProductNotFoundException extends RuntimeException
{
	
	public ProductNotFoundException()
	{
		
	}
	
	public ProductNotFoundException(int id)
	{
		super("Product not found by this Id "+id);
	}
	

}
