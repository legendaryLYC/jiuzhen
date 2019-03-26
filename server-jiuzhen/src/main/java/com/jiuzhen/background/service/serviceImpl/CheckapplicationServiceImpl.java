package com.jiuzhen.background.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.mapper.UserMapper;
import com.jiuzhen.background.service.CheckapplicationService;
/**
 * @author ：宋博通
 * @date ：Created in 2019/3/4 16:41
 * @description：住院审核
 */
@Service("CheckapplicationService")
public class CheckapplicationServiceImpl implements CheckapplicationService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectapplication() {
		// TODO Auto-generated method stub
		return userMapper.selectapplication();
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByopenIdSelective(user);
	}
}
