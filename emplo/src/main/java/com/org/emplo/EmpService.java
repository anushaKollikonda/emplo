package com.org.emplo;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface EmpService {

	public ResponseEntity<?> addEmp(Employee employee);

	public List<Taxpojo> l();

}
