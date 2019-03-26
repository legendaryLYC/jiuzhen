package com.jiuzhen.background.mapper;

import java.util.List;

import com.jiuzhen.background.entity.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> selectHospitalByName(@Param("hospitalName") String hospitalName);

    List<Hospital> selectAll();
}