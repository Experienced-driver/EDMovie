package scu.edu.cn.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.domain.Admin;
import scu.edu.cn.service.AdminService;
import scu.edu.cn.util.AppUtil;
import scu.edu.cn.util.PageData;
import scu.edu.cn.util.Tools;

@Controller
public class LoginController extends BaseController{

	private static Logger logger = Logger.getLogger(LoginController.class);
	@Resource
	private AdminService adminService;
	
	@RequestMapping(value="/toLogin")
	public ModelAndView toLogin() throws Exception{
		logger.info("in LoginController");
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("system/admin/login");
		return mv;
	}
	
	/**
	 * 请求登录，验证用户
	 */
	@RequestMapping(value="/login_login" ,produces="application/json;charset=UTF-8")
	@ResponseBody
	public Object login() throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String errInfo = "";
		String KEYDATA[] = pd.getString("KEYDATA").replaceAll("qq313596790fh", "").replaceAll("QQ978336446fh", "")
				.split(",fh,");

		String USERNAME = KEYDATA[0];
		String PASSWORD = KEYDATA[1];
		logger.info(USERNAME+PASSWORD);
		Admin admin = new Admin();
		admin = adminService.getAdminById(USERNAME);
		logger.info(JSON.toJSONString(admin));
		
		if (admin.getAdPsw().equals(PASSWORD)) {
			logger.info(admin.getAdPsw()+admin.getAdminId());
		} else {
			errInfo = "usererror"; // 用户名或密码有误
		}
		if (Tools.isEmpty(errInfo)) {
			errInfo = "success"; // 验证成功
		}
		map.put("result", errInfo);
		return AppUtil.returnObject(new PageData(), map);
	}

	/**
	 * 访问系统首页
	 */
	@RequestMapping(value="/main/{changeMenu}")
	public ModelAndView login_index(@PathVariable("changeMenu") String changeMenu){
		ModelAndView mv = this.getModelAndView();
		mv.setViewName("system/admin/index");
		return mv;
	}
	/**
	 * 进入tab标签
	 * @return
	 */
	@RequestMapping(value="/tab")
	public String tab(){
		return "system/admin/tab";
	}
	/**
	 * 进入首页后的默认页面
	 */
	@RequestMapping(value="/login_default")
	public String defaultPage(){
		return "system/admin/default";
	}
	
	/**
	 * 用户注销
	 */
	@RequestMapping(value="/logout")
	public ModelAndView logout(){
		ModelAndView mv = this.getModelAndView();
		
		//shiro销毁登录
		Subject subject = SecurityUtils.getSubject(); 
		subject.logout();
		
		mv.setViewName("system/admin/login");
		return mv;
	}
}
