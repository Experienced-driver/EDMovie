package scu.edu.cn.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import scu.edu.cn.service.AdminService;

@Controller
public class AdminController {
	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	@Resource
	AdminService adminService;
	
}
