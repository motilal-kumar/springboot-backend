package com.test.springboot.repository;

import com.test.springboot.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
