package scu.edu.cn.dao;

import scu.edu.cn.domain.HotList;

public interface HotListMapper {
    int deleteByPrimaryKey(Integer hotId);

    int insert(HotList record);

    int insertSelective(HotList record);

    HotList selectByPrimaryKey(Integer hotId);

    int updateByPrimaryKeySelective(HotList record);

    int updateByPrimaryKey(HotList record);
}