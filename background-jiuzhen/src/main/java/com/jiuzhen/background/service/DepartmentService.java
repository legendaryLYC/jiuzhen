package com.jiuzhen.background.service;

import com.jiuzhen.background.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> selectDepartmentByName(Long hospitalId, String hospitalName);

    List<Department> selectAll(Long hospitalId);
    
    List<Department> selectAlldepartments();
    
    Department selectdepartmentByid(Integer id);
    
    int updata(Department department);
    
    int deleteByid(Integer id);
}
