package com.jiuzhen.background.controller;

import com.jiuzhen.background.entity.Doctor;
import com.jiuzhen.background.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/4 20:50
 * @description：医生列表类
 */
@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @ResponseBody
    @RequestMapping
    public Map<String, Object> index(String doctorName, Long departmentId) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Doctor> doctorList =null;
        if(!"".equals(doctorName) && doctorName != null){
            doctorList = doctorService.selectDoctorByName(departmentId,doctorName);
        }
        else{
            doctorList = doctorList = doctorService.selectAll(departmentId);
        }
        map.put("doctorList", doctorList);
        return map;
    }
    @ResponseBody
    @RequestMapping("/doctordetail")
    public Map<String, Object> doctorDetail(Integer doctorId) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        Doctor doctor = doctorService.selectByPrimaryKey(doctorId);
        map.put("doctor", doctor);
        return map;
    }
}
