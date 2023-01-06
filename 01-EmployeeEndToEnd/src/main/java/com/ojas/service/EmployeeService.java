package com.ojas.service;

import java.util.List;
import java.util.Map;

import com.ojas.model.Employee;
import com.ojas.model.Response;

public interface EmployeeService {
	public List<Employee> getEmpDataBelogHyd(String address);
	public  Employee getHeighestSal();  
	public  Employee getLowSal();
	public List<Employee> getEmployeesAgeLess50();
	public List<Employee> getEmpDataSalBetweenTenToTwentyFiveThousound();
	public List<Response>  totalSalDeptWise();
	
	
	

}
