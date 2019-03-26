package com.jiuzhen.background.controller;

import com.jiuzhen.background.entity.Hospital;
import com.jiuzhen.background.service.HospitalService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 主要负责医院相关的业务
 */
@Controller
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    /**
    * @Author: 李永成
    * @Date: 2019/3/4
    * @Description:  查询医院列表
    * @Param:  医院名称
    * @return:  医院列表
    */
    @ResponseBody
    @RequestMapping
    public Map<String, Object> index(String hospitalName) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Hospital> hospitalList =null;
        if(!"".equals(hospitalName) && hospitalName != null){
            hospitalList = hospitalService.selectHospitalByName(hospitalName);
        }
        else{
            hospitalList = hospitalService.selectAll();
        }
        map.put("hospitalList", hospitalList);
       return map;
    }

    @ResponseBody
    @RequestMapping("/details")
    public Map<String, Object> details(Long id) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("content", "这是id为：" +  id + "的医院详情");
        return map;
    }

}
