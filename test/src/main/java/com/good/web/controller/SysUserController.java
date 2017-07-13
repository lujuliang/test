package com.good.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.good.web.model.source1.SysUser;
import com.good.web.service.SysUserService;


@RestController
public class SysUserController {
	
	
	@Autowired
	private SysUserService sysUserService; 
	
	
	@RequestMapping(value = "/test0")
	public ModelAndView index(HttpSession session, HttpServletRequest request) {
			return new ModelAndView("index");
	}
	
	

	@RequestMapping(value = "/sysUser/insertUser",method = RequestMethod.POST ,consumes = "application/json")
	public Map<String,Object> insertUser(@RequestBody SysUser sysUser){
		
		int r = sysUserService.insert(sysUser);
		Map map = new HashMap();
		map.put("success", r);
		return map;
	}
	

}
