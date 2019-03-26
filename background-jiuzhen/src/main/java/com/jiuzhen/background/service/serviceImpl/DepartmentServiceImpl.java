package com.jiuzhen.background.service.serviceImpl;

import com.jiuzhen.background.entity.Department;
import com.jiuzhen.background.mapper.DepartmentMapper;
import com.jiuzhen.background.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/4 15:00
 * @description：医院列表
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectDepartmentByName(Long hospitalId, String departmentName){
        departmentName = departmentName.trim();
        List<Department> departmentList = departmentMapper.selectDepartmentByName(hospitalId,departmentName);
        return departmentList;
    }
    @Override
    public List<Department> selectAll(Long hospitalId){
        List<Department> departmentList = departmentMapper.selectAll(hospitalId);
        return departmentList;
    }
	@Override
	public List<Department> selectAlldepartments() {
		// TODO Auto-generated method stub
		return departmentMapper.selectAlldepartments();
	}
	@Override
	public int updata(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.updateByPrimaryKeySelective(department);
	}
	@Override
	public int deleteByid(Integer id) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Department selectdepartmentByid(Integer id) {
		// TODO Auto-generated method stub
		return departmentMapper.selectByPrimaryKey(id);
	}
	
	
}
