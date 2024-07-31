package com.example.demo.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApiRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemp;

	public String addDataInfo(int id, String name, int salary) {
		
		try {
			String q = "insert into xxcust_emp_tbl(emp_id,emp_name,emp_salary)\r\n"
					+ "values (?,?,?)"; 
			
			 this.jdbcTemp.update(q,id,name,salary);
			 
			 return id + "id data added SuccessFully!!";
			
			
		}catch (Exception e) {
			return e.getMessage();		
		}
		
		

		
	}
	
	

}
