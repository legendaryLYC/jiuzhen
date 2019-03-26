package com.jiuzhen.background.service.serviceImpl;

import com.jiuzhen.background.entity.Message;
import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.mapper.MessageMapper;
import com.jiuzhen.background.mapper.UserMapper;
import com.jiuzhen.background.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/5 10:37
 * @description：用户信息
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    
    @Autowired
    MessageMapper messageMapper;
    
    @Override
    public User selectByopenId(String openID){
        return userMapper.selectByopenId(openID);
    }

    @Override
    public Boolean insertSelective(User user){
        int result = userMapper.insertSelective(user);
        if(result!=0){
            return true;
        }
        else {
            return false;
        }
    }


	@Override
	public Message selectmessageBymessageid(Integer messageid) {
		// TODO Auto-generated method stub
		return messageMapper.selectByPrimaryKey(messageid);
	}

    @Override
    public boolean updateByopenId(User user){
        int result = userMapper.updateByopenId(user);
        if(result!=0){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean updateByopenIdSelective(User user){
        int result = userMapper.updateByopenIdSelective(user);
        if(result!=0){
            return true;
        }
        else{
            return false;
        }
    }

}
