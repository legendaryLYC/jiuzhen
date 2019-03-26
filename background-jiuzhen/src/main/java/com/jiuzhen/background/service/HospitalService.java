package com.jiuzhen.background.service;

import com.jiuzhen.background.entity.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalService {
    List<Hospital> selectHospitalByName(String hospitalName);

    List<Hospital> selectAll();
    
    Hospital selectHospitalByid(Long id);
    
    int updata(Hospital hospital);
    
    int deleteByid(Long id);
}
