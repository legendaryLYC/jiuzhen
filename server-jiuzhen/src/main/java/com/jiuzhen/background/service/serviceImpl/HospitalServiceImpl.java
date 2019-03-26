package com.jiuzhen.background.service.serviceImpl;

import com.jiuzhen.background.entity.Hospital;
import com.jiuzhen.background.mapper.HospitalMapper;
import com.jiuzhen.background.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/4 15:00
 * @description：医院列表
 */
@Service("HospitalService")
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> selectHospitalByName(String hospitalName){
        hospitalName=hospitalName.trim();
        List<Hospital> hospitalList = hospitalMapper.selectHospitalByName(hospitalName);
        return hospitalList;
    }
    @Override
    public List<Hospital> selectAll(){
        List<Hospital> hospitalList = hospitalMapper.selectAll();
        return hospitalMapper.selectAll();
    }
	@Override
	public int updata(Hospital hospital) {
		// TODO Auto-generated method stub
		return hospitalMapper.updateByPrimaryKeySelective(hospital);
	}
	@Override
	public int deleteByid(Long id) {
		// TODO Auto-generated method stub
		return hospitalMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Hospital selectHospitalByid(Long id) {
		// TODO Auto-generated method stub
		return hospitalMapper.selectByPrimaryKey(id);
	}
	
}
