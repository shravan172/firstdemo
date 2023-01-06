package com.ojas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Employee;
import com.ojas.model.Response;
import com.ojas.repository.EmployeeRepository;
import com.ojas.service.EmployeeServiceImpl;

@RestController
public class EmpController {
	@Autowired
	private EmployeeServiceImpl empimp;
	//@Autowired
	//private EmployeeRepository erepo;
	
	@GetMapping("/getdata/{address}")
	public List<Employee> getData(@PathVariable("address") String address){
		 List<Employee> emp=empimp.getEmpDataBelogHyd(address);
		return emp;
		
	}
	@GetMapping("/getempsaldata")
	public Employee getEmployeeHeighestSal(){
		 Employee emp=empimp.getHeighestSal();
		return emp;
		
	}
	@GetMapping("/getlowsaldata")
	public Employee getEmployeeLowestSal(){
		 Employee emp=empimp.getLowSal();
		return emp;

	}
	@GetMapping("/getage")
	public List<Employee> getEmployeeAgeLessFifty() {
	List<Employee>	emplist=empimp.getEmployeesAgeLess50();
		return emplist;
		
	}
	@GetMapping("/getsal")
	public List<Employee> getEmpSalTenAnd25() {
	List<Employee>	emplist=empimp.getEmpDataSalBetweenTenToTwentyFiveThousound() ;
			
		return emplist;
	}
	@GetMapping("/getsumofsal")
	public List<Response> getSumOfSalDeptWise() {
		List<Response>	emplist=empimp.totalSalDeptWise() ;
		
				
			return emplist;
		}
}
