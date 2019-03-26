package com.jiuzhen.background.controller.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jiuzhen.background.entity.Hospital;
import com.jiuzhen.background.service.HospitalService;

/**
 * 主要负责医院信息修改
 * @Author: 宋博通
 * @return
 * @throws IOException
 */
@Controller
@RequestMapping("/hospitaledit")
public class HospitaleditController {
	
	@Autowired HospitalService hospitalService;
	/**
     * 查询医院信息
     * @Author: 宋博通
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> hospitallist() throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Hospital> hospitallist = hospitalService.selectAll();
        System.out.println("==================");
        System.out.println(hospitallist.get(0).getAddress());
        map.put("hospitallist", hospitallist);
        return map;
    }

    
    @ResponseBody
    @RequestMapping("/edit")
    public Map<String, Object> hospitallistedit(Long id) throws IOException {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	Hospital hospital = hospitalService.selectHospitalByid(id);
		map.put("hospital", hospital);
        return map;
    }
    
    
    @ResponseBody
    @RequestMapping("/save")
    public Map<String, Object> hospitallistsave(Hospital hospital) throws IOException {
    	
        Map<String, Object> map = new HashMap<String, Object>();
        try {
			hospitalService.updata(hospital);
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
			hospitalService.deleteByid(id);
			map.put("result", "1");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", "0");
		}
        
        return map;
    }
   
}