package com.jiuzhen.background.mapper;

import com.jiuzhen.background.entity.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    List<Doctor> selectdoctorByName(@Param("departmentId")Long departmentId, @Param("doctorName")String doctorName);

    List<Doctor> selectAll (@Param("departmentId")Long departmentId);
    
    List<Doctor> selectAlldoctor();
}