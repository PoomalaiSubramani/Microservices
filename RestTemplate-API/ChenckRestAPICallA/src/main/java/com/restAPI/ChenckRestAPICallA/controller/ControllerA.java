package com.restAPI.ChenckRestAPICallA.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.ChenckRestAPICallA.vo.model.Employee;

@RestController
@RequestMapping("/CheckRestTempApi")
public class ControllerA {
	
	@GetMapping(path="/fetchEmployees")
	public Employee checkRestTemplate(){
	/*	ArrayList<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));	*/	
		return new Employee(12,"Saran",100,new Date());
	}
	
	
	@GetMapping(path="/fetchEmployeeList", produces="application/json")
	public List<Employee> fetchEmployeeList(){
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));		
		return empList;
	}
	
	@PostMapping(path="/addEmployee", produces="application/json")
	public List<Employee> createEmployeeList(@RequestBody Employee employee){
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));	
		empList.add(employee);
		return empList;
	}
	
	@PutMapping(path="/UpdateEmployee", produces="application/json")
	public List<Employee> UpdateEmployeeList(@RequestBody Employee employee){
		System.out.println("called UpdateEmployeeList");
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));	
		
		Iterator<Employee> iteEmp=empList.iterator();
		while(iteEmp.hasNext()){
			Employee empDetails=iteEmp.next();
			if(empDetails.getEmpId()==12){
				empDetails.setName(employee.getName());
				empDetails.setSalary(employee.getSalary());				
			}
			
		}
		return empList;
	}

	
	@DeleteMapping(path="/DeleteEmployee", produces="application/json")
	public List<Employee> deleteEmployeeList(@RequestBody Employee employee){
		System.out.println("called deleteEmployeeList");
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));	
		
		Iterator<Employee> iteEmp=empList.iterator();
		while(iteEmp.hasNext()){
			Employee empDetails=iteEmp.next();
			if(empDetails.getEmpId()==12){
				empDetails.setName(employee.getName());
				empDetails.setSalary(employee.getSalary());				
			}
			
		}
		return empList;
	}
	
	@DeleteMapping(path="/DeleteEmp")
	public void deleteEmployee(){
		System.out.println("called deleteEmployeeList");
		
	}
	@GetMapping(path="/DeleteEmployeeXML", produces="application/xml")	
	public List<Employee> deleteEmployeeListXML(){
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(123,"Karkum",5000,new Date()));
		empList.add(new Employee(124,"Raj",500,new Date()));
		empList.add(new Employee(126,"Anath",50000,new Date()));
		empList.add(new Employee(12,"Saran",100,new Date()));		
		
		return empList;
	}
}
