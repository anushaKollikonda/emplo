package com.org.emplo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmpController {
	
	@Autowired
	EmpService s;
	
	@RequestMapping(value={"/addEmp"},method = RequestMethod.POST)
    public ResponseEntity<?>  addEmp(@RequestBody Employee employee)
    {
         return s.addEmp(employee);
    }
	
	@RequestMapping(value={"/getEmpSalary"},method = RequestMethod.GET)
    public List<Taxpojo> addEmp()
    {
         return  s.l();
    }

}
