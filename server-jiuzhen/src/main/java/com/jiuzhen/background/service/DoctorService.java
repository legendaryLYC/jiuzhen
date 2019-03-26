package com.jiuzhen.background.service;

import com.jiuzhen.background.entity.Doctor;

import java.util.List;

public interface DoctorService {

    List<Doctor> selectDoctorByName(Long departmentId,String doctorName);

    List<Doctor> selectAll(Long departmentId);
    
    List<Doctor> selectAlldoctor();
    
    Doctor selectdoctoByid(Integer id);
    
    int updata(Doctor doctor);
    
    int deleteByid(Integer id);

    Doctor selectByPrimaryKey(Integer id);
}
