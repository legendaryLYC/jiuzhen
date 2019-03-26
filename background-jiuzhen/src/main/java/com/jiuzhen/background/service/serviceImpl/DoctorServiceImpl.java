package com.jiuzhen.background.service.serviceImpl;

import com.jiuzhen.background.entity.Doctor;
import com.jiuzhen.background.mapper.DoctorMapper;
import com.jiuzhen.background.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/4 20:54
 * @description：医生列表类
 */
@Service("DoctorService")
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> selectDoctorByName(Long departmentId,String doctorName){
        doctorName=doctorName.trim();
        List<Doctor> doctorList = doctorMapper.selectdoctorByName(departmentId,doctorName);
        return doctorList;
    }
    @Override
    public List<Doctor> selectAll(Long departmentId){
        return doctorMapper.selectAll(departmentId);
    }
	@Override
	public List<Doctor> selectAlldoctor() {
		// TODO Auto-generated method stub
		return doctorMapper.selectAlldoctor();
	}
	@Override
	public int updata(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorMapper.updateByPrimaryKeySelective(doctor);
	}
	@Override
	public int deleteByid(Integer id) {
		// TODO Auto-generated method stub
		return doctorMapper.deleteByPrimaryKey(id);
	}
	@Override

	public Doctor selectdoctoByid(Integer id) {
		// TODO Auto-generated method stub
		return doctorMapper.selectByPrimaryKey(id);
	}
	
	@Override
    public Doctor selectByPrimaryKey(Integer id){
        return doctorMapper.selectByPrimaryKey(id);
    }

}
