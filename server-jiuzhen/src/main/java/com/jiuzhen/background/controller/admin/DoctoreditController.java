package com.jiuzhen.background.controller.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jiuzhen.background.entity.Doctor;
import com.jiuzhen.background.service.DoctorService;

/**
 * 主要负责医生信息修改
 * @Author: 宋博通
 * @return
 * @throws IOException
 */
@Controller
@RequestMapping("/doctoredit")
public class DoctoreditController {
	
	@Autowired DoctorService doctorService;
	/**
     * 查询负责医生信息修改信息
     * @Author: 宋博通
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> doctorlist() throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctorlist = doctorService.selectAlldoctor();
        System.out.println("==================");
        System.out.println(doctorlist.get(0).getDetail());
        map.put("doctorlist", doctorlist);
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/edit")
    public Map<String, Object> doctoredit(Long id) throws IOException {
    	
        Map<String, Object> map = new HashMap<String, Object>();
        
        Doctor doctor = doctorService.selectdoctoByid(Integer.valueOf(id.toString()));
		map.put("doctor",doctor);
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/save")
    public Map<String, Object> doctorsave(Doctor doctor) throws IOException {
    	
        Map<String, Object> map = new HashMap<String, Object>();
        try {
        	doctorService.updata(doctor);
			map.put("result", "1");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", "0");
		}
        
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> hospitallistdelete(Long id) throws IOException {
    	
        Map<String, Object> map = new HashMap<String, Object>();
        try {
        	doctorService.deleteByid(Integer.valueOf(id.toString()));
			map.put("result", "1");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", "0");
		}
        
        return map;
    }
   
}