package scu.edu.cn.dao;

import scu.edu.cn.domain.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Integer comId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Integer comId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}