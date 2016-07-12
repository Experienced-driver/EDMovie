package scu.edu.cn.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import scu.edu.cn.dao.AdminMapper;
import scu.edu.cn.domain.Admin;

@Component
public class AdminService {

	@Resource
	private AdminMapper adminMapper;
	
	public Admin getAdminById(String adminId){
		return this.adminMapper.selectByPrimaryKey(adminId);
	}
}
