package com.jiuzhen.background.controller;

import com.jiuzhen.background.entity.Department;
import com.jiuzhen.background.entity.Hospital;
import com.jiuzhen.background.service.DepartmentService;
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
 * @date ：Created in 2019/3/4 16:05
 * @description：医院科室类
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @ResponseBody
    @RequestMapping
    public Map<String, Object> index(String hospitalName,Long hospitalId) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Department> departmentList =null;
        if(!"".equals(hospitalName) && hospitalName != null){

            departmentList = departmentService.selectDepartmentByName(hospitalId,hospitalName);
        }
        else{
            departmentList = departmentService.selectAll(hospitalId);
        }
        map.put("departmentList", departmentList);
        return map;
    }
}
