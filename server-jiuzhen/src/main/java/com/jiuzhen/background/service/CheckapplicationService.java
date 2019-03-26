package com.jiuzhen.background.service;

import java.util.List;
import com.jiuzhen.background.entity.User;

public interface CheckapplicationService {
	
	List<User> selectapplication();
	
	User selectByPrimaryKey(Long id);
	
	int updateByPrimaryKeySelective(User user);
}
