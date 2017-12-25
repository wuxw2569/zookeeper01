package com.test.zookeeper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.zookeeper.service.IUserService;
import com.test.zookeeper.utils.bean.ResponseBean;
import com.test.zookeeper.utils.bean.ResponseStatusEnum;

@RestController
public class IndexController {
	
	@Autowired
	IUserService userService;
	
	
	
	@RequestMapping("/")
	@ResponseBody
	public ResponseBean index(){
		ResponseBean rb = new ResponseBean();
		rb.setData(userService.getList());
		return rb;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public ResponseBean add(String name,Integer age){
		ResponseBean rb = new ResponseBean();
		if(userService.add(name,age)){
			rb.setCode(ResponseStatusEnum.OK.getValue());
		}
		return rb;
	}
	
}
