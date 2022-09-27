package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repository.CustomerRepository;


@RestController
public class CustomerController {
	@Autowired
private CustomerRepository repo;
	
	@GetMapping("/all")
	public List<CustomerEntity> getAll()
	{
	 return	repo.findAll();
	}
	
	
	
	
	
	
	@PostMapping("/save")
	public CustomerEntity saveDoctor(@RequestBody CustomerEntity Customer)
	{
					
		return repo.save(Customer);
	}
	
	
	@DeleteMapping("/doctor/{id}")
	void deleteDoctor(@PathVariable Integer id)
	{
		repo.deleteById(id);
	}
	
		
	
}
