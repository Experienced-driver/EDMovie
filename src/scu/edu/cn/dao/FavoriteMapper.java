package scu.edu.cn.dao;

import scu.edu.cn.domain.Favorite;

public interface FavoriteMapper {
    int deleteByPrimaryKey(Integer favId);

    int insert(Favorite record);

    int insertSelective(Favorite record);

    Favorite selectByPrimaryKey(Integer favId);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);
}