package com.jiuzhen.background.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.service.CheckapplicationService;

/**
 * 主要负责用户住院审核
 */
@Controller
@RequestMapping("/checkapplication")
public class AdminLoginController {

	@Autowired CheckapplicationService checkapplicationService;
	/**
     * 查询住院申请表
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> checkapplication() throws IOException {

        Map<String, Object> map = new HashMap<String, Object>();
        List<User> checkList = new ArrayList<>();
        checkList = checkapplicationService.selectapplication();
        map.put("checkList", checkList);

        return map;
    }

    /**
     * 审核住院申请表
     * @Author: 宋博通
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("/checkpass")
    public Map<String, Object> judgeyes(Long id) throws IOException {

    	Map<String, Object> map = new HashMap<String, Object>();
    	User application = checkapplicationService.selectByPrimaryKey(id);
    	
    	application.setStatus(3);
    	checkapplicationService.updateByPrimaryKeySelective(application);
    	map.put("result", "1");
        return map;
    }

    @ResponseBody
    @RequestMapping("/checknopass")
    public Map<String, Object> judgeno(Long id) throws IOException {

    	Map<String, Object> map = new HashMap<String, Object>();
    	User application = checkapplicationService.selectByPrimaryKey(id);

    	application.setStatus(4);
    	checkapplicationService.updateByPrimaryKeySelective(application);
    	map.put("result", "0");

        return map;
    }


}
