package com.neusoft.newcharge.controllers;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.newcharge.po.Emp;
import com.neusoft.newcharge.service.EmpService;

@Controller
public class EmpHandler {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping(value="/emp/findAll.action")
	@ResponseBody
	public List<Emp> findAll(HttpServletRequest request) {
		List<Emp> list = Arrays.asList();
		try {
			list = empService.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// request.setAttribute("list", list);
		// return "forward:/showList.jsp";
		return list;
	}
	
	@RequestMapping(value="/emp/insert.action")
	@ResponseBody
	public String insert(String ename) {
		
		try {
			empService.save(ename);
			return "{\"result\": true}";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "{\"result\": false}";
		}
		// return "forward:findAll.action";
	}
}
