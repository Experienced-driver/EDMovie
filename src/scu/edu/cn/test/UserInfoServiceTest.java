package scu.edu.cn.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.domain.UserInfo;
import scu.edu.cn.service.UserInfoService;

public class UserInfoServiceTest {

	private static Logger logger = Logger.getLogger(UserInfoServiceTest.class);
	ApplicationContext ctx = null;
	private UserInfoService userInfoService;
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("scu/edu/cn/config/applicationContext.xml");
		userInfoService = (UserInfoService) ctx.getBean("userInfoService");
	}
	@Test
	public void testAddUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setEmail("445358008@qq.com");
		Date date = new Date(2011,10,28,10,12,50); 
		userInfo.setBirthdate(date);
		userInfo.setGender("男");
		userInfo.setPassword("123456");
		userInfo.setQq(445358009);
		userInfo.setSignDate(date);
//		userInfo.setUserId(7);
		userInfo.setUsername("韩峰");
		userInfo.setUserStatus("sign in");
		
		userInfoService.addUserInfo(userInfo);
	}

	@Test
	public void testGetUserInfoById() {
		UserInfo userInfo = userInfoService.getUserInfoById(50);
//		logger.info(JSON.toJSONString(userInfo));
		if(JSON.toJSONString(userInfo).equals(null)){
			logger.info(JSON.toJSONString(userInfo));
		}
	}

}
