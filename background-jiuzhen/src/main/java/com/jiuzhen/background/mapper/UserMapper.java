package com.jiuzhen.background.mapper;

import java.util.List;

import com.jiuzhen.background.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //获取住院申请人员
    List<User> selectapplication();

    User selectByopenId(@Param("openId") String openID);

    int updateByopenId(User user);

    int updateByopenIdSelective(User user);
}