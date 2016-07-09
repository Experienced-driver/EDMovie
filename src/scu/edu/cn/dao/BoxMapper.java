package scu.edu.cn.dao;

import scu.edu.cn.domain.Box;

public interface BoxMapper {
    int deleteByPrimaryKey(Integer boxId);

    int insert(Box record);

    int insertSelective(Box record);

    Box selectByPrimaryKey(Integer boxId);

    int updateByPrimaryKeySelective(Box record);

    int updateByPrimaryKey(Box record);
}