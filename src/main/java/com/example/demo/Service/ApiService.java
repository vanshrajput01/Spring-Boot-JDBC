package com.example.demo.Service;

import java.util.List;

import com.example.demo.ResponseDto.Response;

public interface ApiService {

	String addData(int id, String name, int salary);

	String updateData(int id, String name, int salary);

	String deleteData(int id);

	Response getData(int id);

	List<Response> getAllData();

}
