package scu.edu.cn.dao;

import scu.edu.cn.domain.RecomUser;

public interface RecomUserMapper {
    int insert(RecomUser record);

    int insertSelective(RecomUser record);
}