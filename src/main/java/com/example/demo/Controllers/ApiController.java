package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	@GetMapping("/addData")
	public String addData(@RequestParam(name = "id") int id,
						  @RequestParam(name = "name") String name,
						  @RequestParam(name = "salary") int salary) {
		
		
		return apiService.addData(id,name,salary);
		
	}
	
	@GetMapping("/updateData")
	public String updateData(@RequestParam(name = "id") int id,
						  @RequestParam(name = "name") String name,
						  @RequestParam(name = "salary") int salary) {
		
		
		return apiService.updateData(id,name,salary);
		
	}
	
	@DeleteMapping("/DeleteData")
	public String deleteData(@RequestParam(name = "id") int id) {
		
		
		return apiService.deleteData(id);
		
	}
	


	


}
