package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ApiRepository;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private ApiRepository apiRepo;

	@Override
	public String addData(int id, String name, int salary) {
		
		return apiRepo.addDataInfo(id,name,salary);
	}

	@Override
	public String updateData(int id, String name, int salary) {
		
		return apiRepo.UpdateInfo(id, name, salary);
		

		
	}

	@Override
	public String deleteData(int id) {
		
		return this.apiRepo.deleteDataInfo(id);
	}

}
