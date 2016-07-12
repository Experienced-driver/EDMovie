package scu.edu.cn.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.domain.Page;
import scu.edu.cn.domain.UserInfo;
import scu.edu.cn.service.UserInfoService;
import scu.edu.cn.util.PageData;

@Controller
public class UserInfoController extends BaseController{
	
	private static final Logger logger = Logger.getLogger(UserInfoController.class);
	
	@Resource
	UserInfoService userInfoService;
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
		UserInfo userInfo = new UserInfo();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		logger.info(username+gender);
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		userInfo.setGender(gender);
		
		userInfo.setEmail("445358008@qq.com");
		Date date = new Date(); 
		userInfo.setBirthdate(date);
		userInfo.setQq(445358009);
		userInfo.setSignDate(date);
		userInfo.setUserStatus(gender);
		logger.info(JSON.toJSONString(userInfo));
		userInfoService.addUserInfo(userInfo);
		
		return new ModelAndView("UserRegistered");
	}
	
	@RequestMapping(value="/dictionaries")
	public ModelAndView listUsers(Page page)throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();	
		
		page.setPd(pd);
		List<UserInfo>	userList = userInfoService.listPdPageUser();			//列出用户列表
		logger.info(JSON.toJSON(userList));
		mv.setViewName("system/user/user_list");
		mv.addObject("userList", JSON.toJSON(userList));
		mv.addObject("pd", pd);
		return mv;
	}
}
