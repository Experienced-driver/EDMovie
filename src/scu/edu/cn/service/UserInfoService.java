package scu.edu.cn.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import scu.edu.cn.dao.UserInfoMapper;
import scu.edu.cn.domain.UserInfo;

@Component
public class UserInfoService {
	private static final Logger logger = Logger.getLogger(UserInfoService.class);
	@Resource
	private UserInfoMapper userInfoMapper;
	
	public void addUserInfo(UserInfo userInfo){
		userInfoMapper.insert(userInfo);
	}
	public UserInfo getUserInfoById(int userId){
		return this.userInfoMapper.selectByPrimaryKey(userId);
	}
	public List<UserInfo> listPdPageUser(){
		List<UserInfo> listUser = new ArrayList<UserInfo>();
		UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
		for(int i = 1;i <= 10;i++){
			listUser.add(userInfo);
			userInfo = userInfoMapper.selectByPrimaryKey(i);
			logger.info(JSON.toJSONString(userInfo));
		}
		return listUser;
	} 

}
