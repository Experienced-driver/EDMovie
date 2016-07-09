package scu.edu.cn.dao;

import scu.edu.cn.domain.UserFeed;

public interface UserFeedMapper {
    int deleteByPrimaryKey(Integer feedId);

    int insert(UserFeed record);

    int insertSelective(UserFeed record);

    UserFeed selectByPrimaryKey(Integer feedId);

    int updateByPrimaryKeySelective(UserFeed record);

    int updateByPrimaryKey(UserFeed record);
}