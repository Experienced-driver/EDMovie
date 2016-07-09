package scu.edu.cn.dao;

import scu.edu.cn.domain.ChangePsw;

public interface ChangePswMapper {
    int deleteByPrimaryKey(Integer changePswId);

    int insert(ChangePsw record);

    int insertSelective(ChangePsw record);

    ChangePsw selectByPrimaryKey(Integer changePswId);

    int updateByPrimaryKeySelective(ChangePsw record);

    int updateByPrimaryKey(ChangePsw record);
}