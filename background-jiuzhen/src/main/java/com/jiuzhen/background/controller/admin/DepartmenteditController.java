package com.jiuzhen.background.controller.admin;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jiuzhen.background.entity.Department;
import com.jiuzhen.background.service.DepartmentService;

/**
 * 科室信息修改
 * @Author: 宋博通
 * @return
 * @throws IOException
 */
@Controller
@RequestMapping("/departmentedit")
public class DepartmenteditController {
	
	@Autowired DepartmentService departmentService;
	
    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> departmentlist() throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Department> departmentlist = departmentService.selectAlldepartments();
        System.out.println("==================");
        System.out.println(departmentlist.get(2).getName());
        map.put("departmentlist", departmentlist);
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/edit")
    public Map<String, Object> departmentedit(Long id) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        Department department = departmentService.selectdepartmentByid(Integer.valueOf(id.toString()));
		map.put("department",department);
        return map;
    }
    
    @ResponseBody
    @RequestMapping("/save")
    public Map<String, Object> departmentsave(Department department) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
        	departmentService.updata(department);
			map.put("result", "1");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", "0");
		}
        return map;
    }
    
    
    @ResponseBody
    @RequestMapping("/delete")
    public Map<String, Object> departmentdelete(Long id) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
        	departmentService.deleteByid(Integer.valueOf(id.toString()));
			map.put("result", "1");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("result", "0");
		}
        return map;
    }
    
}
