package com.jiuzhen.background.service;

import com.jiuzhen.background.entity.Message;
import com.jiuzhen.background.entity.User;

public interface UserService {

    User selectByopenId(String openID);

    Boolean insertSelective(User user);

    
    Message selectmessageBymessageid(Integer messageid);

    boolean updateByopenId(User user);

    boolean updateByopenIdSelective(User user);

}
