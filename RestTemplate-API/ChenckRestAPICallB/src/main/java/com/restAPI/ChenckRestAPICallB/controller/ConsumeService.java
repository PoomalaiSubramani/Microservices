package com.restAPI.ChenckRestAPICallB.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restAPI.ChenckRestAPICallA.vo.model.Employee;



@RestController
@RequestMapping("/ConsumeService")
public class ConsumeService {
	
	@Autowired
	RestTemplate restTemp;
	
	@GetMapping(path="/employeeConsume")	
	public String consumeEmployeeDetails(){		
	
		
		/*//Fetch Employee details using exchange method and return type is String
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity=new HttpEntity<>(header);		
		ResponseEntity<String> empStr1=restTemp.exchange("http://localhost:8080/CheckRestTempApi/fetchEmployees",HttpMethod.GET, entity, String.class);	    
	    
		
	    String empstr= empStr1.getBody();
	    HttpHeaders header1Str= empStr1.getHeaders();
	    HttpStatus httpStatuStr=  empStr1.getStatusCode();	 
	 
	 System.out.println("Emp String:"+empstr);
	 
	 System.out.println("HttpHeaders :"+header1Str+" httpStatu:"+httpStatuStr+" empObj.getStatusCodeValue():"+empStr1.getStatusCodeValue());
*/		
	 
		
	/*//Fetch Employee details using exchange method and return type is Employee
		ResponseEntity<Employee> empObj=restTemp.exchange("http://localhost:8080/CheckRestTempApi/fetchEmployees",HttpMethod.GET, entity, Employee.class);	    
	    
	    Employee empObj1= empObj.getBody();
	    HttpHeaders header1= empObj.getHeaders();
	    HttpStatus httpStatu=  empObj.getStatusCode();
	 
	 
	 System.out.println("Emp :"+empObj1.toString());
	 
	 System.out.println("HttpHeaders :"+header1+" httpStatu:"+httpStatu+" empObj.getStatusCodeValue():"+empObj.getStatusCodeValue());
				
*/		
		
		//Fetch List of Employee details using exchange method and return type is String
			/*	HttpHeaders header=new HttpHeaders();
				header.setContentType(MediaType.APPLICATION_JSON);
				
				HttpEntity<Object> entity=new HttpEntity<>(header);		
				ResponseEntity<String> empStr1=restTemp.exchange("http://localhost:8080/CheckRestTempApi/fetchEmployeeList",HttpMethod.GET, entity, String.class);	    
			    				
			    String empstr= empStr1.getBody();
			    HttpHeaders header1Str= empStr1.getHeaders();
			    HttpStatus httpStatuStr=  empStr1.getStatusCode();
			 
			 System.out.println("Emp String:"+empstr);
			 System.out.println("HttpHeaders :"+header1Str+" httpStatu:"+httpStatuStr+" empObj.getStatusCodeValue():"+empStr1.getStatusCodeValue());
	*/		 
			//Fetch List of Employee details using exchange method and return type is List
			/*	HttpHeaders header=new HttpHeaders();
				header.setContentType(MediaType.APPLICATION_JSON);
				
				HttpEntity<Object> entity=new HttpEntity<>(header);		
				ResponseEntity<List> empStr1=restTemp.exchange("http://localhost:8080/CheckRestTempApi/fetchEmployeeList",HttpMethod.GET, entity, List.class);	    
			    				
			    List<Employee> empstr= empStr1.getBody();
			    HttpHeaders header1Str= empStr1.getHeaders();
			    HttpStatus httpStatuStr=  empStr1.getStatusCode();
			 
			 System.out.println("Emp String:"+empstr);
			 System.out.println("HttpHeaders :"+header1Str+" httpStatu:"+httpStatuStr+" empObj.getStatusCodeValue():"+empStr1.getStatusCodeValue());
	*/		 
		
		//Add employee details using exchange method and return type is List
		
	/*	Employee employee=new Employee(120,"Nike",20000,new Date());
		
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity=new HttpEntity<>(employee,header);
		
		ResponseEntity<List> responseEntity=restTemp.exchange("http://localhost:8080/CheckRestTempApi/addEmployee", HttpMethod.POST, entity, List.class);
		List empList=responseEntity.getBody();
		HttpHeaders respHeaders=responseEntity.getHeaders();
		HttpStatus httpStatus=responseEntity.getStatusCode();
		int statusCodevalue=responseEntity.getStatusCodeValue();
		
		 System.out.println("Emp :"+empList);
		 System.out.println("HttpHeaders :"+respHeaders+" httpStatu:"+httpStatus+" StatusCodeValue():"+statusCodevalue);*/


	//Update employee details using exchange method and return type is List
		
//		Employee employee=new Employee(120,"Nike",20000,new Date());
//		
//		HttpHeaders header=new HttpHeaders();
//		header.setContentType(MediaType.APPLICATION_JSON);
//		
//		HttpEntity<Object> entity=new HttpEntity<>(employee,header);
//		
//		ResponseEntity<List> responseEntity=restTemp.exchange("http://localhost:8080/CheckRestTempApi/UpdateEmployee", HttpMethod.PUT, entity, List.class);
//		List empList=responseEntity.getBody();
//		HttpHeaders respHeaders=responseEntity.getHeaders();
//		HttpStatus httpStatus=responseEntity.getStatusCode();
//		int statusCodevalue=responseEntity.getStatusCodeValue();
//		
//		 System.out.println("Emp :"+empList);
//		 System.out.println("HttpHeaders :"+respHeaders+" httpStatu:"+httpStatus+" StatusCodeValue():"+statusCodevalue);
		
	//Update employee details using exchange method and return type is List
		
		/*Employee employee=new Employee(120,"Nike",20000,new Date());
		
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity=new HttpEntity<>(employee,header);
		
		ResponseEntity<List> responseEntity=restTemp.exchange("http://localhost:8080/CheckRestTempApi/DeleteEmployee", HttpMethod.DELETE, entity, List.class);
		List empList=responseEntity.getBody();
		HttpHeaders respHeaders=responseEntity.getHeaders();
		HttpStatus httpStatus=responseEntity.getStatusCode();
		int statusCodevalue=responseEntity.getStatusCodeValue();
		
		 System.out.println("Emp :"+empList);
		 System.out.println("HttpHeaders :"+respHeaders+" httpStatu:"+httpStatus+" StatusCodeValue():"+statusCodevalue);
		 
		 
		return empList;*/
		//Fetch Employee details using getForEntity 
	/*	ResponseEntity<String> responseEntity= restTemp.getForEntity("http://localhost:8080/CheckRestTempApi/fetchEmployees", String.class);
		String employee=responseEntity.getBody();
		*/
		/*ResponseEntity<Employee> responseEntity= restTemp.getForEntity("http://localhost:8080/CheckRestTempApi/fetchEmployees", Employee.class);
		Employee employee=responseEntity.getBody();*/
		
		//Save and Fetch Employee details using postForEntity 
	/*	Employee employeeReq=new Employee();
		employeeReq.setEmpId(123);
		employeeReq.setName("Kaja");
		employeeReq.setSalary(12000);
		employeeReq.setDoj(new Date());
		
		ResponseEntity<String> responseEntity=restTemp.postForEntity("http://localhost:8080/CheckRestTempApi/addEmployee", employeeReq, String.class);
		String employee=responseEntity.getBody();*/
		
			/*Employee empObj=restTemp.getForObject("http://localhost:8080/CheckRestTempApi/fetchEmployees", Employee.class);
		System.out.println("Employee Details:"+empObj);*/
		
		//delete emp details
		//restTemp.delete("http://localhost:8080/CheckRestTempApi/DeleteEmp");
		
		Employee employeeReq=new Employee();
		employeeReq.setEmpId(123);
		employeeReq.setName("Kaja");
		employeeReq.setSalary(12000);
		employeeReq.setDoj(new Date());
		
		restTemp.put("/UpdateEmployee", employeeReq);
		
		
		
		
		
		
		return "success";
		
	}

}
