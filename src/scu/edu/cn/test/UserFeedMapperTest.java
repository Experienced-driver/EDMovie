package scu.edu.cn.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.dao.UserFeedMapper;
import scu.edu.cn.domain.UserFeed;

public class UserFeedMapperTest {

	private static Logger logger = Logger.getLogger(UserFeedMapperTest.class);
	ApplicationContext ctx = null;
	private UserFeedMapper userFeedMapper = null;
	
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("scu/edu/cn/config/applicationContext.xml");
		userFeedMapper = (UserFeedMapper) ctx.getBean("userFeedMapper");
	}
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		UserFeed userFeed = new UserFeed();
		userFeed.setFeedCont("很好");
		userFeed.setFeedId(5);
		userFeed.setFeedReceiver(1);
		userFeed.setFeedStatus("待处理");
		Date date = new Date();
		userFeed.setFeedTime(date);
		userFeed.setUserId(1);
		userFeedMapper.insert(userFeed);
	}

	@Test
	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByPrimaryKey() {
		UserFeed userFeed = new UserFeed();
		userFeed = userFeedMapper.selectByPrimaryKey(1);
		logger.info(JSON.toJSONString(userFeed));
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateByPrimaryKey() {
		fail("Not yet implemented");
	}

}
