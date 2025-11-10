package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;


@Service
public class Example 
{
	
	
	private static List<Product> l1=new ArrayList<>(Arrays.asList(
			
			new Product(1,"A","Java"),
			new Product(2,"B","Python"),
			new Product(3,"C","C++"),
			new Product(4,"D","Sql")
			
			));
			
	
	public List<Product> retrieveData()
	{
		return l1;
	}
	
	
	public void addData(Product p1)
	{
		
		 l1.add(p1);
	}
	
	public Product getDataById(int id)
	{
		
		return l1.stream().filter(a->a.getId()==id).findFirst().orElseThrow(()->new ProductNotFoundException(id));
		
		
	}
	
	public boolean updateData(Product p1,int id)
	{
		for(int i=0;i<l1.size();i++)
		{
			Product p2 = l1.get(i);
			
			if(p2.getId()==id)
			{
				l1.set(i, p1);
				return true;
			}
			
		}
	
		throw new ProductNotFoundException(id);
	}
	
	
	public void deleteData(int id)
	{
		
		boolean removeIf = l1.removeIf(a->a.getId()==id);
		
		if(!removeIf)
		{
			throw new ProductNotFoundException(id);
		}

	}

}
