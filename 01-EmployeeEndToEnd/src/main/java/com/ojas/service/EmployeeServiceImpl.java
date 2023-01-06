package com.ojas.service;

//import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.EmployeeEntity;
import com.ojas.model.Employee;
import com.ojas.model.Response;
import com.ojas.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository erepo;
	

	@Override
	public List<Employee> getEmpDataBelogHyd(String address) {
		List<Employee> emplist = new ArrayList<Employee>();

		List<EmployeeEntity> e = erepo.findEmployeeByAddress(address);
		e.forEach(emp1 -> {
			Employee emp = new Employee();
			BeanUtils.copyProperties(emp1, emp);

			emplist.add(emp);
		});

		return emplist;
	}

	@Override
	public Employee getHeighestSal() {
		
		
		EmployeeEntity e = erepo.findEmployeeBySalary();
		
            
			Employee emp = new Employee();
			BeanUtils.copyProperties(e, emp);

			

		return emp;
	}

	@Override
	public Employee getLowSal() {
		EmployeeEntity e = erepo.findEmpBySalary();
		
        
		Employee emp = new Employee();
		BeanUtils.copyProperties(e, emp);

		

	return emp;
		
		
	}

	@Override
	public List<Employee> getEmployeesAgeLess50() {
		// TODO Auto-generated method stub
	List<EmployeeEntity>emp=	erepo.findEmpAgeLess50();
	List<Employee> emplist = new ArrayList<Employee>();

	
	emp.forEach(emp1 -> {
		Employee em = new Employee();
		BeanUtils.copyProperties(emp1, em);

		emplist.add(em);
	});

	return emplist;
}
		
		

	@Override
	public List<Employee> getEmpDataSalBetweenTenToTwentyFiveThousound() {
	
		List<EmployeeEntity>emp=	erepo.findEmpAgeLess50();
		List<Employee> emplist = new ArrayList<Employee>();

		
		emp.forEach(emp1 -> {
			Employee em = new Employee();
			BeanUtils.copyProperties(emp1, em);

			emplist.add(em);
		});

		return emplist;
		
	
	}

	@Override
	public List<Response> totalSalDeptWise() {
	
		 
	
		List<Response>emp	=erepo.findEmpSalSomOfDeptwise();
		List<Response> emplist=new ArrayList();
		
		
	
		
		emp.forEach(emp1 -> {
			Response em = new Response();
			BeanUtils.copyProperties(emp1, em);

			emplist.add(em);
		});
		
		/*Map<String,Integer> m=new HashMap<>();
		//Set<String>al=new HashSet();
		//Object[] o = al.toArray();
	
		ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<String, Integer>();

	for(int j=0;j<map.size();j++) {
   	 
    	int	sum=0;
    	if(()){ 

        		 sum=sum+salary;
        		
        	}
        	  m.put(d, sum);
        	
}
		
}
     //int sum=0;
      int sal=0;
      String d="";
      Set<Entry<String, Integer>> s=null;
      for(EmployeeEntity emp1 :emp){
			Employee emp2=new Employee();
			BeanUtils.copyProperties(emp1, emp2);
       d=emp2.getEmpdept(); 
     sal=emp2.getEmpsal();  
      
      
        
        al.add(d);
       
        m.put(d, sal);
      
     for ( Map.Entry<String, Integer> entry : m.entrySet()) {
    	    String key = entry.getKey();
    	    int salary=entry.getValue();
    	      	 
      for(int j=0;j<o.length-1;j++) {
    	 
    	int	sum=0;
    	if(entry.equals(o[j])){ 

        		 sum=sum+salary;
        		
        	}
        	  m.put(d, sum);
        	*/
      
        
	   
        	
      System.out.println(emp);  
     
      
	


		return emp;
		

		
	}

}
