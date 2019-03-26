package com.jiuzhen.background.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.service.UserService;


/**
 * 主要负责获取用户信息
 * @Author: 宋博通
 * @return
 * @throws IOException
 */
@Controller
@RequestMapping("/getuserinfor")
public class InformationGetController {
	
	@Autowired UserService userService;
	
    @ResponseBody
    @RequestMapping
    public Map<String, Object> informationlist(String openId) throws IOException {
    	Map<String, Object> map = new HashMap<String, Object>(); 
		/* openId = "oUq7E5Iuldw8zKTHKXZUbl0B6_rI"; */
    	User informationUser = userService.selectByopenId(openId);
    	//System.out.println(informationUser.getName());
		map.put("informationUser",informationUser); 

    	return map;
		 
    }
}