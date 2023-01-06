package com.ojas.repository;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ojas.entity.EmployeeEntity;
import com.ojas.model.Employee;
import com.ojas.model.Response;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

	@Query(value = "select *from employee where eaddress=?1", nativeQuery = true)
	public List<EmployeeEntity> findEmployeeByAddress(String address);

	@Query(value = "select eid,ename,eaddress,eage,esal,skillset,edept,max(esal) from employee", nativeQuery = true)
	public EmployeeEntity findEmployeeBySalary();
	
	@Query(value = "select eid,ename,eaddress,eage,esal,skillset,edept,min(esal) from employee", nativeQuery = true)
	public EmployeeEntity findEmpBySalary();
	@Query(value = "select * from employee where eage<=50", nativeQuery = true)
	public List<EmployeeEntity> findEmpAgeLess50();
	@Query(value = "select * from employee where esal between 10000 and 25000", nativeQuery = true)
	public List<EmployeeEntity> findEmpSalBetweenTenAnd25();
	
	
	//@Query(value = "select eid,ename,eaddress,eage,esal,skillset,edept,sum(esal) from employee group by edept", nativeQuery = true)
	//public List<Response> findEmpSalSomOfDept();
	
    @Query(value = "select new com.ojas.model.Response(e.empdept,sum(e.empsal))"+ " from EmployeeEntity e group by e.empdept ")
	public List<Response> findEmpSalSomOfDeptwise();
	
}
