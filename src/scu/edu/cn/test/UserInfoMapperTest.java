package scu.edu.cn.test;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.dao.UserInfoMapper;
import scu.edu.cn.domain.UserInfo;
import scu.edu.cn.service.UserInfoService;

public class UserInfoMapperTest {

	private static Logger logger = Logger.getLogger(UserInfoMapperTest.class);
	ApplicationContext ctx = null;
	private UserInfoMapper userInfoMapper = null;
	private UserInfoService userInfoService = null;
	
	@Before
	public void before() {
		ctx = new ClassPathXmlApplicationContext("scu/edu/cn/config/applicationContext.xml");
		userInfoMapper = (UserInfoMapper) ctx.getBean("userInfoMapper");
		userInfoService = (UserInfoService) ctx.getBean("userInfoService");
	}
	
	@Test
	public void testDeleteByPrimaryKey() {

	}

	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setEmail("445358008@qq.com");
		Date date = new Date(2011,10,28,10,12,50); 
		userInfo.setBirthdate(date);
		userInfo.setGender("男");
		userInfo.setPassword("123456");
		userInfo.setQq(445358009);
		userInfo.setSignDate(date);
//		userInfo.setUserId(4);
		userInfo.setUsername("韩峰");
		userInfo.setUserStatus("sign in");
		userInfoMapper.insert(userInfo);
		System.out.println("添加成功");

	}

	@Test
	public void testInsertSelective() {

	}

	@Test
	public void testSelectByPrimaryKey() {
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
		logger.info(JSON.toJSONString(userInfo));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {

	}

	@Test
	public void testUpdateByPrimaryKey() {

	}
	@Test
	public void testIUserInfoService(){
		UserInfo userInfo = userInfoService.getUserInfoById(1);
		logger.info(JSON.toJSONString(userInfo));
	}

}
