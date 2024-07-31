package com.example.demo.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.ResponseDto.Response;

@Repository
public class ApiRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemp;

	public String addDataInfo(int id, String name, int salary) {
		
		try {
			String q = "insert into xxcust_emp_tbl(emp_id,emp_name,emp_salary)\r\n"
					+ "values (?,?,?)"; 
			
			 this.jdbcTemp.update(q,id,name,salary);
			 
			 return id + " id data added SuccessFully!!";
			
			
		}catch (Exception e) {
			return e.getMessage();		
		}
		
		

		
	}

	public String UpdateInfo(int id, String name, int salary) {
		try {
			
			String q = "update  xxcust_emp_tbl\r\n"
					+ "set emp_name = ? , emp_salary = ? \r\n"
					+ "where emp_id = ?";
			
			this.jdbcTemp.update(q,name,salary,id);
			
			return id + " id data updated SuccessFully!!";
			
		} catch (Exception e) {
			
			return e.getMessage();
			
		}
		
	}

	public String deleteDataInfo(int id) {
		
		try {
			
			String q = "delete from xxcust_emp_tbl\r\n"
					+ "where emp_id = ?";
			
			this.jdbcTemp.update(q,id);
			
			return id + " id data delete Successfully!!";
			
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public Response getDataInfo(int id) {
		
		
		String q = "select * from xxcust_emp_tbl where emp_id = ?";
		
		 Response result = (Response) this.jdbcTemp.queryForObject(q, new RowMapper() {
			
			@Override
			public Response mapRow(ResultSet rs, int rowNum) throws SQLException {
				Response objResponse = new Response();
				objResponse.setEmp_id(rs.getInt("emp_id"));
				objResponse.setEmp_name(rs.getString("emp_name"));
				objResponse.setEmp_salary(rs.getInt("emp_salary"));
				return objResponse;
			}},id);
		 
		 return result;
		
		
		
	}
	
	

}
