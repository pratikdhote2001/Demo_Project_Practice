package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class MainController
{
	
	@Autowired
	private Example example;
	
	@GetMapping("/get")
	public List<Product> getData()
	{
		return example.retrieveData();
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Product p1)
	{
		 example.addData(p1);
		 
		 return  ResponseEntity.status(HttpStatus.CREATED).body("Data Added Sucessfully");
	}
	
	@GetMapping("/get/{id}")
	public Product getDataById(@PathVariable("id") int id)
	{
		
		Product dataById = example.getDataById(id);
		return dataById;
	}
	
	@PutMapping("/update/{id}")
	public boolean updateData(@PathVariable("id") int id,@RequestBody Product p1)
	{
		boolean updateData = example.updateData(p1, id);
		return updateData;
	}
	
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id)
	{
		
		example.deleteData(id);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Data Deleted Sucessfully");
		
	}
	
	
	@GetMapping("/get")
	public String demoMethodHandler()
	{
	     return "Demo Project";
	}
}
