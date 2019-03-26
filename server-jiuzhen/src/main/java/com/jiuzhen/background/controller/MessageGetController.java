package com.jiuzhen.background.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiuzhen.background.entity.Message;
import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.service.UserService;



/**
 * 主要负责获取用户消息
 * @Author: 宋博通
 * @return
 * @throws IOException
 */
@Controller
@RequestMapping("/getusermesssage")
public class MessageGetController {
	
	@Autowired UserService userService;
	
    @ResponseBody
    @RequestMapping
    public Map<String, Object> messsagedetail(String openId) throws IOException {
		System.out.println("==========");
		System.out.println(openId+"====");
		System.out.println("+++++++++++");
    	Map<String, Object> map = new HashMap<String, Object>(); 
		/* openId = "oHicY57V2kcVMNouKcJvkSnGskus"; */
    	User informationUser = userService.selectByopenId(openId);
    	//System.out.println(informationUser.getName());
    	
    	String messageidString = informationUser.getMessageid();
		String[] messages = null;
    	if(messageidString != null && !"".equals(messageidString)){
			messages = messageidString.split(",");
		}else{
			messages = new String[0];
		}
    	
    	List<Message> messagedetail=new ArrayList<Message>();
//    	System.out.println(messages[0]);
//    	Integer messageid0 = Integer.valueOf(messages[0]);
//    	System.out.println(userService.selectmessageBymessageid(messageid0).getDetail());
    	
//    	for(int i = 0;i<messages.length;i++) {
//    		System.err.println("=="+i);
//    		Integer messageid = Integer.valueOf(messages[i]);
//    		messagedetail.set(i,userService.selectmessageBymessageid(messageid));
//    	}
    	for(int i = 0;i<messages.length;i++) {
    		if(messages[i]==null||messages[i].equals("")) {}
    		else {
    			Integer messageid = Integer.valueOf(messages[i]);
        		messagedetail.add(userService.selectmessageBymessageid(messageid));
    		}
    	}
    	System.out.println(informationUser.getName());
		map.put("messagedetail",messagedetail); 

    	return map;
		 
    }
}