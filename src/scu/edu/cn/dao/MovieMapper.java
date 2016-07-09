package scu.edu.cn.dao;

import scu.edu.cn.domain.Movie;

public interface MovieMapper {
    int deleteByPrimaryKey(Integer mvId);

    int insert(Movie record);

    int insertSelective(Movie record);

    Movie selectByPrimaryKey(Integer mvId);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
}