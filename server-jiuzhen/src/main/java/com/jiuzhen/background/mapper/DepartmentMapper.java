package com.jiuzhen.background.mapper;

import com.jiuzhen.background.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department>selectDepartmentByName(@Param("hospitalId")Long hospitalId,@Param("departmentName")String departmentName);

    List<Department> selectAll (@Param("hospitalId")Long hospitalId);
    
    List<Department> selectAlldepartments();
}