package scu.edu.cn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import scu.edu.cn.dao.UserInfoMapper;
import scu.edu.cn.domain.UserInfo;

@Component
public class UserInfoService {
	@Resource
	private UserInfoMapper userInfoMapper;
	
	public void addUserInfo(UserInfo userInfo){
		userInfoMapper.insert(userInfo);
	}
	public UserInfo getUserInfoById(int userId){
		return this.userInfoMapper.selectByPrimaryKey(userId);
	}
}
