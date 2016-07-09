package scu.edu.cn.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import scu.edu.cn.domain.UserInfo;
import scu.edu.cn.service.UserInfoService;

@Controller
public class UserInfoController extends MultiActionController{
	
	private static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);
		
	@Resource
	UserInfoService userInfoService;
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
		UserInfo userInfo = new UserInfo();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userInfo.setGender(gender);
		
		userInfo.setEmail("445358008@qq.com");
		Date date = new Date(2011,10,28,10,12,50); 
		userInfo.setBirthdate(date);
		userInfo.setQq(445358009);
		userInfo.setSignDate(date);
//		userInfo.setUserId(11);
		userInfo.setUserStatus(gender);
		
		userInfoService.addUserInfo(userInfo);
		
		return new ModelAndView("UserRegistered");
	}
	
}
