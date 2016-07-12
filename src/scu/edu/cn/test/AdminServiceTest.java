package scu.edu.cn.test;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.domain.Admin;
import scu.edu.cn.service.AdminService;

public class AdminServiceTest {

	private static Logger logger = Logger.getLogger(AdminServiceTest.class);
	ApplicationContext ctx = null;
	private AdminService adminService;
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("scu/edu/cn/config/applicationContext.xml");
		adminService = (AdminService) ctx.getBean("adminService");
	}
	@Test
	public void testGetAdminByNameAndPwd() {
		Admin admin = adminService.getAdminById("admin");
		logger.info(JSON.toJSONString(admin));
	}

}
