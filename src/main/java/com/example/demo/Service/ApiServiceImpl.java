package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ApiRepository;
import com.example.demo.ResponseDto.Response;

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

	@Override
	public Response getData(int id) {
		
		return this.apiRepo.getDataInfo(id);
	}

	@Override
	public List<Response> getAllData() {
		
		return this.apiRepo.getAllDataInfo();
	}

}
