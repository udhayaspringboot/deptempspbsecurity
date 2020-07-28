package com.deptempspbsecurity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deptempspbsecurity.model.Department;
@Repository
public interface DeptRepo extends CrudRepository<Department, Integer> {

}
